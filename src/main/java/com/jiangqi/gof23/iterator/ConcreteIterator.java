package com.jiangqi.gof23.iterator;

/**
 * 迭代器接口模拟实现类
 * @author jiangqi
 *
 */
public class ConcreteIterator<T> implements Iterator<T> {
	private ConcreteAggregate<T> aggregate;
	private int current=0;

	public ConcreteIterator(ConcreteAggregate<T> aggregate){
		this.aggregate=aggregate;
	}
	
	 @Override
	public T first() {
		// TODO Auto-generated method stub
		return this.aggregate.getIndex(0);
	}

	@Override
	public T next() {
		// TODO Auto-generated method stub
		T o=null;
		this.current++;
		if(this.current<this.aggregate.count())
			o=this.aggregate.getIndex(this.current);
		return o;
	}

	@Override
	public boolean isDone() {
		// TODO Auto-generated method stub
		if(this.current>=this.aggregate.count())
			return true;
		else
			return false;
	}

	@Override
	public T currentItem() {
		// TODO Auto-generated method stub
		return this.aggregate.getIndex(this.current);
	}

}
