package com.jiangqi.tools.dto;

import java.beans.IntrospectionException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * Dto接口
 * 
 * @author jiangqi
 *
 */
public interface IDto extends Serializable, Cloneable {
	/**
	 * 功能：对Dto中的全部属性进行校验
	 * 
	 * @return 返回的校验失败的信息；全部属性校验通过则返回空集合
	 **/
	public List<String> checkValid()
			throws IllegalAccessException, InvocationTargetException, NoSubClassException;

	/**
	 * 功能：对Dto中的修改过的属性进行校验
	 * 
	 * @return 返回的校验失败的信息；全部属性校验通过则返回空集合
	 **/
	public List<String> checkChangeValid()
			throws IllegalAccessException, InvocationTargetException, NoSubClassException;

	/**
	 * 功能：对paramArrayOfString中的属性进行校验
	 * 
	 * @param paramArrayOfString 需校验的全部属性名称
	 * @return 返回的校验失败的信息； 全部属性校验通过则返回null
	 **/
	public List<String> checkValid(List<String> paramArrayOfString)
			throws IllegalAccessException, InvocationTargetException, NoSubClassException;

	/**
	 * 校验Dto中除paramArrayOfString 以外的全部属性
	 * 
	 * @param paramArrayOfString 需要排除在校验外的属性名称
	 * @return 返回的校验失败的信息； 全部属性校验通过则返回null
	 **/
	public List<String> checkValidExcept(List<String> paramArrayOfString)
			throws IllegalAccessException, InvocationTargetException, NoSubClassException;

	/**
	 * 返回Dto中变更过的全部属性名称
	 * 
	 * @return 全部变更过的属性名称
	 **/
	public List<String> getChangedFields();

	/**
	 * 返回加密后的列名
	 * 
	 * @return 全部加密后的列名
	 **/
	public List<String> getEncryptColumnNames();

	/**
	 * 将Dto中被改变的全部属性值恢复到改变前
	 **/
	public void restoreChangedValule() throws NoSubClassException, NoSuchFieldException, IntrospectionException,
	IllegalAccessException, ClassNotFoundException, InvocationTargetException ;

	/**
	 * 清除Dto变更标记
	 **/
	public void clearChangedFlag();

	/**
	 * 返回Dto的属性值是否被更改过
	 **/
	public Boolean isChanged()throws ClassNotFoundException, IllegalAccessException,
	InvocationTargetException, NoSubClassException, IntrospectionException;
}
