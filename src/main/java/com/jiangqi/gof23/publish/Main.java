package com.jiangqi.gof23.publish;

public class Main {

	/**
	 * publish/subscribe 观察者模式
	 * 观察者模式定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个
	 * 主体对象。这个主体对象在状态变化时，会通知所有观察者对象，使他能够自动更新自己。
	 */
	public static void main(String[] args) {

		ConcreteSubject s=new ConcreteSubject();
		s.attach(new ConcreteObserver(s,"X"));
		s.attach(new ConcreteObserver(s,"Y"));
		s.attach(new ConcreteObserver(s,"Z"));
		
		s.setSubjectState("ABC");
		s.publish();
	}
}
