package com.jiangqi.gof23.mediator;

public class Main {

	/**
	 * 中介者模式：Mediator
	 * 用一个中介对象来封装一系列的对象交互。中介者使各对象不需要显示的相互引用，从而使其松耦合，
	 * 而且可以独立改变他们的交互
	 * 
	 * 同事类间关系复杂，为网状方式，通过中介模式提取出一个中介类将这些关系变成星状，
	 */
	public static void main(String[] args) {

		ConcreteMediator m=new ConcreteMediator();
		
		ConcreteColleague1 c1=new ConcreteColleague1(m,"同事1");
		ConcreteColleague2 c2=new ConcreteColleague2(m,"同事2");
		ConcreteColleague2 c3=new ConcreteColleague2(m,"同事3");
		
		m.addColleague(c1).addColleague(c2).addColleague(c3);
		
		c1.send("吃过饭没？", "同事2");
		c2.send("1要请我们吃饭？","同事3");
		c3.send("你打算请客？","同事1");
		
	}

}
