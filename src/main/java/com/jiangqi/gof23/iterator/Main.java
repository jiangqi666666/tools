package com.jiangqi.gof23.iterator;

public class Main {

	/**
	 * 迭代器模式：Iterator
	 * 提供一种方法顺序访问一个聚合对象中各个元素，而又不暴露该对象的内部表示
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteAggregate<String> a=new ConcreteAggregate<String>();
		a.addObjectByIndex(0, "大鸟");
		a.addObjectByIndex(1, "大鸟1");
		a.addObjectByIndex(2, "大鸟2");
		a.addObjectByIndex(3, "大鸟3");
		a.addObjectByIndex(4, "大鸟4");
		a.addObjectByIndex(5, "大鸟5");
		a.addObject("大鸟6");
		a.addObject("大鸟7");
		
		//Iterator i=new ConcreteIterator(a);
		Iterator<String> i=a.createIterator();
		i.first();
		while(!i.isDone()){
			System.out.println(i.currentItem()+"请买票！");
			i.next();
		}
		
	}

}
