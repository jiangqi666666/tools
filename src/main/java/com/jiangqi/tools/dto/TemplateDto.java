package com.jiangqi.tools.dto;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.log4j.Logger;

import com.jiangqi.tools.beanmanager.BeanConvert;

public abstract class TemplateDto implements IDto {

	private static final long serialVersionUID = -8428401132506530688L;
	private static Logger logger = Logger.getLogger(TemplateDto.class);

	private Map<String, Object> changedValues = new HashMap<String, Object>();
	private Object subClass = null;

	/**
	 * 保存子类实例，供后续函数使用
	 * 
	 * @param subClass 子类实例
	 */
	protected void setSubClass(Object subClass) {
		logger.info("setSubClass(Object subClass)");
		logger.debug("subClass=" + subClass);

		this.subClass = subClass;
	}

	/**
	 * 校验子类一个属性<br>
	 * 子类中需校验属性时，必须实现valid+属性名称的方法，checkValid会反射调用此方法完成校验
	 * 
	 * @param name 需校验的属性名称
	 * @return 校验返回的错误信息
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 * @throws NoSubClassException
	 */
	@SuppressWarnings("unchecked")
	private List<String> checkValid(String name)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSubClassException {

		logger.info("checkValid(String name)");
		logger.debug("name=" + name);

		if (this.subClass == null) {
			logger.error("subClass==null");
			throw new NoSubClassException("Dto构造方法中必须添加super.setSubClass(this)语句");
		}

		Method beanMethod = null;
		String methodStr = null;
		methodStr = getMethodName(name, "valid");

		List<String> ret = new ArrayList<String>();
		try {
			beanMethod = this.subClass.getClass().getMethod(methodStr);

			logger.debug("调用" + this.subClass + "中" + methodStr + "()方法");

			ret = (List<String>) beanMethod.invoke(this.subClass);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			logger.debug(this.subClass + "中，不存在" + methodStr + "()方法");
		}
		return ret;
	}

	public List<String> checkValid()
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSubClassException {

		logger.info("checkValid()");

		if (this.subClass == null) {
			logger.error("subClass==null");
			throw new NoSubClassException("Dto构造方法中必须添加super.setSubClass(this)语句");
		}

		List<String> ret = new ArrayList<String>();
		Field[] field = this.subClass.getClass().getDeclaredFields();

		List<String> tmp = null;
		for (int i = 0; i < field.length; i++) {
			if (field[i].getModifiers() == Modifier.PRIVATE) {
				tmp = checkValid(field[i].getName());
				ret.addAll(tmp);
			}
		}
		return ret;
	}

	public List<String> checkValid(List<String> paramArrayOfString)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSubClassException {

		logger.info("checkValid(List<String> paramArrayOfString)");
		logger.debug("paramArrayOfString尺寸为" + paramArrayOfString.size());

		List<String> ret = new ArrayList<String>();

		for (String str : paramArrayOfString)
			ret.addAll(checkValid(str));

		return ret;
	}

	public List<String> checkChangeValid()
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSubClassException {
		logger.info("checkChangeValid()");
		logger.debug("被改变的列尺寸为：" + this.changedValues.size());

		List<String> ret = new ArrayList<String>();
		ret.addAll(this.changedValues.keySet());
		return checkValid(ret);
	}

	public List<String> checkValidExcept(List<String> paramArrayOfString)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSubClassException {

		logger.info("checkValidExcept(List<String> paramArrayOfString)");
		logger.debug("paramArrayOfString尺寸为：" + paramArrayOfString.size());

		if (this.subClass == null) {
			logger.error("subClass==null");
			throw new NoSubClassException("Dto构造方法中必须添加super.setSubClass(this)语句");
		}

		List<String> ret = new ArrayList<String>();
		Field[] field = this.subClass.getClass().getDeclaredFields();

		List<String> tmp = null;
		for (int i = 0; i < field.length; i++) {
			if (field[i].getModifiers() == Modifier.PRIVATE) {
				for (String str : paramArrayOfString) {
					str = str.trim();
					if (str.equals(field[i].getName()) == true)
						break;
					else {
						tmp = checkValid(field[i].getName());
						ret.addAll(tmp);
					}
				}
			}
		}
		return ret;
	}

	public List<String> getChangedFields() {
		// TODO Auto-generated method stub
		logger.info("getChangedFields()");
		logger.debug("被改变的列尺寸为：" + this.changedValues.size());

		List<String> tmp = new ArrayList<String>();
		if (this.changedValues.isEmpty() == false)
			tmp.addAll(this.changedValues.keySet());

		return tmp;
	}

	public List<String> getEncryptColumnNames() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 获得属性名称转换为特定前缀+属性首字母大写的方法名
	 * 
	 * @param name 属性名称
	 * @param str  前缀
	 * @return 返回的方法名
	 * @throws SecurityException
	 * @throws NoSuchFieldException
	 * @throws IntrospectionException
	 * @throws InvocationTargetException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	private String getMethodName(String name, String str) {
		logger.info("getMethodName(String name, String str)");
		logger.debug("name=" + name);
		logger.debug("str=" + str);

		String tmp = name.substring(0, 1);
		tmp = str + tmp.toUpperCase() + name.substring(1);

		logger.debug("return=" + tmp);
		return tmp;
	}

	public void restoreChangedValule()
			throws NoSubClassException, NoSuchFieldException, SecurityException, IntrospectionException,
			IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {

		logger.info("restoreChangedValule()");
		logger.debug("被改变的列尺寸为：" + this.changedValues.size());

		if (this.subClass == null) {
			logger.error("subClass==null");
			throw new NoSubClassException("Dto构造方法中必须添加super.setSubClass(this)语句");
		}

		Object oldVal = null;
		Field tmpField = null;

		Set<String> tmp = this.changedValues.keySet();
		for (String keyName : tmp) {
			oldVal = this.changedValues.get(keyName);
			tmpField = this.subClass.getClass().getDeclaredField(keyName);
			PropertyDescriptor pd = new PropertyDescriptor(tmpField.getName(), this.subClass.getClass());
			pd.getWriteMethod().invoke(this.subClass, oldVal);
		}

		this.changedValues.clear();

		List<IDto> allSon = this.getAllSon();
		logger.debug(this.subClass + "子节点个数为：" + allSon.size());
		for (IDto dto : allSon)
			dto.restoreChangedValule();
	}

	public void clearChangedFlag() {
		// TODO Auto-generated method stub
		logger.info("clearChangedFlag()");
		logger.debug("被改变的列尺寸为：" + this.changedValues.size());

		this.changedValues.clear();

		try {
			List<IDto> tmp = this.getAllSon();
			logger.debug(this.subClass + "子节点个数为：" + tmp.size());

			for (IDto dto : this.getAllSon())
				dto.clearChangedFlag();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Boolean isChanged() throws ClassNotFoundException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSubClassException, IntrospectionException {
		
		logger.info("isChanged()");
		logger.debug("被改变的列尺寸为：" + this.changedValues.size());

		if (this.changedValues.isEmpty() == true) {
			List<IDto> tmp = getAllSon();
			logger.debug(this.subClass + "子节点个数为：" + tmp.size());
			for (IDto dto : tmp)
				if (dto.isChanged() == true)
					return true;
		} else
			return true;

		return false;
	}

	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();

	}

	protected void saveChange(String name, Object obj) {
		logger.info("saveChange(String name,Object obj)");
		logger.debug("name=" + name);
		logger.debug("obj=" + obj);

		if (this.changedValues.containsKey(name) != true) {
			this.changedValues.put(name, obj);
			logger.debug(name + "原有值：" + obj + "被保存");
		} else {
			logger.debug(name + "已经被修改过");
		}
	}

	private IDto getIDto(String name, Object obj)
			throws IntrospectionException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		PropertyDescriptor pd = new PropertyDescriptor(name, obj.getClass());
		return (IDto) pd.getReadMethod().invoke(obj);
	}

	@SuppressWarnings(value = { "unchecked" })
	private void getListIDto(List<IDto> list, String name, Object obj)
			throws IntrospectionException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		PropertyDescriptor pd = new PropertyDescriptor(name, obj.getClass());
		List<IDto> tmp = (List<IDto>) pd.getReadMethod().invoke(obj);
		list.addAll(tmp);
	}

	private List<IDto> getAllSon() throws NoSubClassException, ClassNotFoundException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, IntrospectionException {

		if (this.subClass == null) {
			logger.error("subClass==null");
			throw new NoSubClassException("Dto构造方法中必须添加super.setSubClass(this)语句");
		}

		List<IDto> ret = new ArrayList<IDto>();
		Class<?> superClass = null;

		Field[] field = this.subClass.getClass().getDeclaredFields();
		for (int i = 0; i < field.length; i++) {
			if (field[i].getModifiers() == Modifier.PRIVATE) {
				superClass = field[i].getType().getSuperclass();
				if (superClass != null && superClass == Class.forName(BeanConvert.TEMPLATE_DTO_NAME)) {
					ret.add(getIDto(field[i].getName(), this.subClass));
					continue;
				}

				if (field[i].getType() == Class.forName(BeanConvert.LIST_NAME)) {
					Class<?> genericClass;

					Type fc = field[i].getGenericType();
					if (fc != null && fc instanceof ParameterizedType) // 【3】如果是泛型参数的类型
					{
						ParameterizedType pt = (ParameterizedType) fc;
						genericClass = (Class<?>) pt.getActualTypeArguments()[0]; // 【4】 得到泛型里的class类型对象。
					} else
						continue;

					superClass = genericClass.getSuperclass();
					if (superClass != null && superClass == Class.forName(BeanConvert.TEMPLATE_DTO_NAME)) {
						getListIDto(ret, field[i].getName(), this.subClass);
					}
				}
			}
		}
		return ret;
	}
}
