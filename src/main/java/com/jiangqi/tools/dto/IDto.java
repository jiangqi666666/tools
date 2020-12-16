package com.jiangqi.tools.dto;

import java.beans.IntrospectionException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * Dto�ӿ�
 * 
 * @author jiangqi
 *
 */
public interface IDto extends Serializable, Cloneable {
	/**
	 * ���ܣ���Dto�е�ȫ�����Խ���У��
	 * 
	 * @return ���ص�У��ʧ�ܵ���Ϣ��ȫ������У��ͨ���򷵻ؿռ���
	 **/
	public List<String> checkValid()
			throws IllegalAccessException, InvocationTargetException, NoSubClassException;

	/**
	 * ���ܣ���Dto�е��޸Ĺ������Խ���У��
	 * 
	 * @return ���ص�У��ʧ�ܵ���Ϣ��ȫ������У��ͨ���򷵻ؿռ���
	 **/
	public List<String> checkChangeValid()
			throws IllegalAccessException, InvocationTargetException, NoSubClassException;

	/**
	 * ���ܣ���paramArrayOfString�е����Խ���У��
	 * 
	 * @param paramArrayOfString ��У���ȫ����������
	 * @return ���ص�У��ʧ�ܵ���Ϣ�� ȫ������У��ͨ���򷵻�null
	 **/
	public List<String> checkValid(List<String> paramArrayOfString)
			throws IllegalAccessException, InvocationTargetException, NoSubClassException;

	/**
	 * У��Dto�г�paramArrayOfString �����ȫ������
	 * 
	 * @param paramArrayOfString ��Ҫ�ų���У�������������
	 * @return ���ص�У��ʧ�ܵ���Ϣ�� ȫ������У��ͨ���򷵻�null
	 **/
	public List<String> checkValidExcept(List<String> paramArrayOfString)
			throws IllegalAccessException, InvocationTargetException, NoSubClassException;

	/**
	 * ����Dto�б������ȫ����������
	 * 
	 * @return ȫ�����������������
	 **/
	public List<String> getChangedFields();

	/**
	 * ���ؼ��ܺ������
	 * 
	 * @return ȫ�����ܺ������
	 **/
	public List<String> getEncryptColumnNames();

	/**
	 * ��Dto�б��ı��ȫ������ֵ�ָ����ı�ǰ
	 **/
	public void restoreChangedValule() throws NoSubClassException, NoSuchFieldException, IntrospectionException,
	IllegalAccessException, ClassNotFoundException, InvocationTargetException ;

	/**
	 * ���Dto������
	 **/
	public void clearChangedFlag();

	/**
	 * ����Dto������ֵ�Ƿ񱻸��Ĺ�
	 **/
	public Boolean isChanged()throws ClassNotFoundException, IllegalAccessException,
	InvocationTargetException, NoSubClassException, IntrospectionException;
}
