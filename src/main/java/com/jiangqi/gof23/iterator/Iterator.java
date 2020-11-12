package com.jiangqi.gof23.iterator;

/**
 * �������ӿ�
 * @author jiangqi
 *
 */
public interface  Iterator <T>{
	/**
	 * ���ص�һ������
	 * @return
	 */
	public  T first();
	
	/**
	 *��������һ������
	 * @return
	 */
	public  T next();
	
	/**
	 * �Ƿ�������
	 * @return true ���  false δ���
	 */
	public  boolean isDone();
	
	/**
	 * ���ص�ǰλ�ö���
	 * @return
	 */
	public  T currentItem();
}
