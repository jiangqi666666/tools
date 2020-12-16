package com.jiangqi.gof23.publish;

/**
 * 观察者实例
 * @author jiangqi
 * @see Observer
 */
public class ConcreteObserver implements Observer {
	private String name;
	private ConcreteSubject subject;
	
	public ConcreteObserver(ConcreteSubject subject,String name){
		this.subject=subject;
		this.name=name;
	}

	@Override
	public void update() {

		System.out.println("观察者{"+this.name+"}的新状态是{"+this.subject.getSubjectState()+"}");
	}
}
