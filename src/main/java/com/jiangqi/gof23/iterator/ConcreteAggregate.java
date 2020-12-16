package com.jiangqi.gof23.iterator;

import java.util.ArrayList;

/**
 * �ۺ϶�����ʾʵ��
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
	 * ���������ö���
	 * @param index ����
	 * @param o ����
	 */
	public void addObjectByIndex(int index,T o){
		this.items.add(index, o);
	}
	
	/**
	 * ��β����Ӷ���
	 * @param index ����
	 * @param o ����
	 */
	public void addObject(T o){
		this.items.add( o);
	}
}
