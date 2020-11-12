package com.jiangqi.gof23.builder;

public class Main {

	/**
	 * 建造者模式：Builder
	 * 在创建复杂对象的算法应该独立于该对象的组成部分以及它们的组装方式时适用；
	 * 这些对象内部构建间的构造顺序通常是稳定的，但对象内部的构建通常面临复杂的变化。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Director dir=new Director(); //创建建造者
		Builder b1=new ConcreteBuilder1(); //创建建造工具1
		Builder b2=new ConcreteBuilder2(); //创建建造工具1
		
		//建造者使用建造工具1创建产品
		dir.construct(b1);
		Product p1=dir.getResult();
		p1.Show();
		
		//建造者使用建造工具2创建产品
		dir.construct(b2);
		Product p2=dir.getResult();
		p2.Show();
	}

}
