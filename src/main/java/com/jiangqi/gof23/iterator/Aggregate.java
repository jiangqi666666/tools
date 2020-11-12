package com.jiangqi.gof23.iterator;

/**
 * �ۺ϶���ӿ�
 * @author jiangqi
 *
 */
public abstract interface Aggregate<T> {
	/**
	 * �����������ӿ�
	 * @return
	 */
	public Iterator<T> createIterator();
	
	/**
	 * ���ؾۺ϶�������
	 * @return
	 */
	public int count();
	
	/**
	 * ���������ض�Ӧ����
	 * @param index ������
	 * @return ��Ӧ�Ķ���
	 */
	public T getIndex(int index);
}
