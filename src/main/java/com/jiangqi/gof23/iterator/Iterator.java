package com.jiangqi.gof23.iterator;

/**
 * 迭代器接口
 * @author jiangqi
 *
 */
public interface  Iterator <T>{
	/**
	 * 返回第一个对象
	 * @return
	 */
	public  T first();
	
	/**
	 *迭代到下一个对象
	 * @return
	 */
	public  T next();
	
	/**
	 * 是否迭代完成
	 * @return true 完成  false 未完成
	 */
	public  boolean isDone();
	
	/**
	 * 返回当前位置对象
	 * @return
	 */
	public  T currentItem();
}
