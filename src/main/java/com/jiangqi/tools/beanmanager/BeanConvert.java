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
	
	public static final String TEMPLATE_DTO_NAME="com.jiangqi.tools.dto.TemplateDto";
	public static final String LIST_NAME="java.util.List";
	
	private BeanConvert() {}
	
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
	public static Object pojo2Dto(Object bean, String dtoName) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IntrospectionException, InvocationTargetException, IllegalArgumentException, NoSuchMethodException, SecurityException{

		Object obj=null;
		Class<?> superClass = null;

		Object ret = Class.forName(dtoName).getDeclaredConstructor().newInstance();

		Field[] field = ret.getClass().getDeclaredFields();
		for (int i = 0; i < field.length; i++) {
			if (field[i].getModifiers() == Modifier.PRIVATE) {
				superClass = field[i].getType().getSuperclass();
				if (superClass != null && superClass == Class.forName(BeanConvert.TEMPLATE_DTO_NAME)) 
					obj=setDtoField(field[i], bean);
				else if (field[i].getType() == Class.forName(BeanConvert.LIST_NAME)) 
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
	private static List setListField(Field field, Object bean) throws IntrospectionException, IllegalAccessException, InvocationTargetException, ClassNotFoundException, InstantiationException, IllegalArgumentException, NoSuchMethodException, SecurityException {
		
		Class<?> genericClass;
		List ret=new ArrayList();

		PropertyDescriptor pd = new PropertyDescriptor(field.getName(), bean.getClass());
		List<?> tmp = (List<?>)pd.getReadMethod().invoke(bean);

		Type fc = field.getGenericType(); // �ؼ��ĵط��������List���ͣ��õ���Generic������  
        if( fc instanceof ParameterizedType) // ��3������Ƿ��Ͳ���������   
        {   
           ParameterizedType pt = (ParameterizedType) fc;  
           genericClass = (Class<?>)pt.getActualTypeArguments()[0]; //��4�� �õ��������class���Ͷ���
        }
        else
        	return ret;
		
		Object superClass = genericClass.getSuperclass();
		if (superClass != null && superClass == Class.forName(BeanConvert.TEMPLATE_DTO_NAME)) {
			for(Object obj:tmp)
				ret.add(pojo2Dto(obj,genericClass.getName()));
		} 
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
	private static Object setDtoField(Field field, Object bean) throws IntrospectionException, InstantiationException, IllegalAccessException, ClassNotFoundException, InvocationTargetException, IllegalArgumentException, NoSuchMethodException, SecurityException {

		PropertyDescriptor pd = new PropertyDescriptor(field.getName(), bean.getClass());

		return pojo2Dto(pd.getReadMethod().invoke(bean), field.getType().getName());
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
	private static Object setSimpleField(Field field, Object bean) throws IntrospectionException, IllegalAccessException, InvocationTargetException {

		PropertyDescriptor pd = new PropertyDescriptor(field.getName(), bean.getClass());

		return pd.getReadMethod().invoke(bean);
	}
}
