package com.jiangqi.gof23.publish;

/**
 * �۲���ʵ��
 * @author jiangqi
 * @see Observer
 */
public class ConcreteObserver implements Observer {
	private String name;
	private String observerState;
	private ConcreteSubject subject;
	
	public ConcreteObserver(ConcreteSubject subject,String name){
		this.subject=subject;
		this.name=name;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		this.observerState=this.subject.getSubjectState();
		System.out.println("�۲���{"+this.name+"}����״̬��{"+this.observerState+"}");
	}
}
