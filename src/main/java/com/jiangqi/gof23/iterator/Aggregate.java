package com.jiangqi.gof23.iterator;

/**
 * 聚合对象接口
 * @author jiangqi
 *
 */
public abstract interface Aggregate<T> {
	/**
	 * 创建迭代器接口
	 * @return
	 */
	public Iterator<T> createIterator();
	
	/**
	 * 返回聚合对象数量
	 * @return
	 */
	public int count();
	
	/**
	 * 按索引返回对应对象
	 * @param index 索引号
	 * @return 对应的对象
	 */
	public T getIndex(int index);
}
