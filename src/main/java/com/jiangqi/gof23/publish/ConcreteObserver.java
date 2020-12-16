package com.jiangqi.gof23.publish;

/**
 * �۲���ʵ��
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

		System.out.println("�۲���{"+this.name+"}����״̬��{"+this.subject.getSubjectState()+"}");
	}
}
