package com.jiangqi.gof23.state;

public class Main {

	/**
	 * 状态模式：State
	 * 当一个对象的内在状态改变时允许改变其他行为，这个对象看起来像是改了了其类；
	 * 状态模式主要解决的是当控制一个对象状态转换的条件表达式过于复杂的时候，把
	 * 状态的判断逻辑转移到表示不同状态的一系列类当中，可以把复杂的判断逻辑简化（如判断很简单就不用使用此模式）；
	 * 将特定状态相关行为存放到不同的ConcreteState子类中，通过定义新的子类就可以很容易地增加新的状态和转换；
	 * 
	 * 这个状态模式我自己改成了如下方式
	 * 1、实现状态机的3个事件
	 * 2、通过预定义的状态策略，通过事件方式自动变更状态
	 */
	public static void main(String[] args) {

		StateMachine c=new StateMachine();
		Context context=new Context();
		
		String tmp="-------------";
	
		c.changeState(context,"start");
		System.out.println(tmp);
		
		c.changeState(context,"a1");
		System.out.println(tmp);
		
		c.changeState(context,"b1");
		
		System.out.println(tmp);
		c.changeState(context,"a2");
		
		System.out.println(tmp);
		
		c.changeState(context,"start");
		c.changeState(context,"a1");
		c.changeState(context,"b1");
		c.changeState(context,"a2");
	}

}
