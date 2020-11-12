package com.jiangqi.tools.beanmanager;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * pojo��dto��voת��
 * 
 * @author jiangqi
 *
 */
public class BeanConvert {
	
	public static final String TemplateDtoName="com.jiangqi.tools.dto.TemplateDto";
	public static final String ListName="java.util.List";
	
	/**
	 * pojoת����dto
	 * 
	 * @param bean
	 *            ��Ҫת����pojo
	 * @param dtoName
	 *            dto������
	 * @return ת���ɹ���dto
	 * @throws ClassNotFoundException
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 * @throws InvocationTargetException
	 * @throws IllegalArgumentException
	 * @throws SecurityException
	 * @throws NoSuchMethodException
	 * @throws IntrospectionException 
	 * @throws Exception
	 */
	public static Object Pojo2Dto(Object bean, String dtoName) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IntrospectionException, IllegalArgumentException, InvocationTargetException{

		Object obj=null;
		Class<?> superClass = null;

		Object ret = Class.forName(dtoName).newInstance();

		Field[] field = ret.getClass().getDeclaredFields();
		for (int i = 0; i < field.length; i++) {
			if (field[i].getModifiers() == Modifier.PRIVATE) {
				superClass = field[i].getType().getSuperclass();
				if (superClass != null && superClass == Class.forName(BeanConvert.TemplateDtoName)) 
					obj=setDtoField(field[i], bean);
				else if (field[i].getType() == Class.forName(BeanConvert.ListName)) 
					obj=setListField(field[i], bean);
				else 
					obj=setSimpleField(field[i], bean);
								
				PropertyDescriptor pd = new PropertyDescriptor(field[i].getName(), ret.getClass());
				pd.getWriteMethod().invoke(ret, obj);
			}
		}
		return ret;
	}
	
	@SuppressWarnings(value={"unchecked", "rawtypes"})
	private static List setListField(Field field, Object bean) throws IntrospectionException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException, InstantiationException {
		
		Class<?> genericClass;
		List ret=new ArrayList();

		PropertyDescriptor pd = new PropertyDescriptor(field.getName(), bean.getClass());
		List<?> tmp = (List<?>)pd.getReadMethod().invoke(bean);

		Type fc = field.getGenericType(); // �ؼ��ĵط��������List���ͣ��õ���Generic������  
        if(fc!=null && fc instanceof ParameterizedType) // ��3������Ƿ��Ͳ���������   
        {   
           ParameterizedType pt = (ParameterizedType) fc;  
           genericClass = (Class<?>)pt.getActualTypeArguments()[0]; //��4�� �õ��������class���Ͷ���
        }
        else
        	return ret;
		
		Object superClass = genericClass.getSuperclass();
		if (superClass != null && superClass == Class.forName(BeanConvert.TemplateDtoName)) {
			for(Object obj:tmp)
				ret.add(Pojo2Dto(obj,genericClass.getName()));
		} 
		/*else if (superClass != null && superClass == Class.forName("java.util.List")) {
			obj=setListField(field[i], bean);
		}*/
		else {
			ret.addAll(tmp);
		}
		
		return ret;
	}

	/**
	 * ��pojo��dto��������ֵ��ֵ��dto��Ӧ����
	 * 
	 * @param field
	 *            pojo���踳ֵ��dtoʵ��������
	 * @param bean
	 *            pojoʵ��
	 * @throws IntrospectionException 
	 * @throws SecurityException
	 * @throws NoSuchMethodException
	 * @throws InvocationTargetException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 * @throws ClassNotFoundException
	 * @throws Exception
	 */
	private static Object setDtoField(Field field, Object bean) throws IntrospectionException, InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {

		PropertyDescriptor pd = new PropertyDescriptor(field.getName(), bean.getClass());

		return Pojo2Dto(pd.getReadMethod().invoke(bean), field.getType().getName());
	}

	/**
	 * ���pojoʵ���ļ����Եľ������ʵ��
	 * @param field
	 *            pojo���踳ֵ��dtoʵ��������
	 * @param bean
	 *            pojoʵ��
	 * @throws IntrospectionException 
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	private static Object setSimpleField(Field field, Object bean) throws IntrospectionException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		PropertyDescriptor pd = new PropertyDescriptor(field.getName(), bean.getClass());

		return pd.getReadMethod().invoke(bean);
	}
}
