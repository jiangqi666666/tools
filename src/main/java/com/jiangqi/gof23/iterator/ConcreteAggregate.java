package com.jiangqi.gof23.iterator;

import java.util.ArrayList;

/**
 * 聚合对象演示实例
 * @author jiangqi
 *
 */
public class ConcreteAggregate<T> implements Aggregate<T> {

	private ArrayList<T> items=new ArrayList<>();

	@Override
	public Iterator<T> createIterator() {

		return new ConcreteIterator<>(this) ;
	}

	@Override
	public int count(){
		return this.items.size();
	}
	
	@Override
	public T getIndex(int index){
		return this.items.get(index);
	}
	
	/**
	 * 按索引设置对象
	 * @param index 索引
	 * @param o 对象
	 */
	public void addObjectByIndex(int index,T o){
		this.items.add(index, o);
	}
	
	/**
	 * 在尾部添加对象
	 * @param index 索引
	 * @param o 对象
	 */
	public void addObject(T o){
		this.items.add( o);
	}
}
