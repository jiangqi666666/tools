package com.jiangqi.gof23.mediator;

/**
 * ����ͬ����
 */
public abstract class Colleague {
	protected Mediator mediator;
	protected String name;

	public Colleague(Mediator mediator,String name) {
		this.mediator = mediator;
		this.name=name;
	}
	
	/**
	 * ������ͬ�·�����Ϣ
	 * @param message ��Ϣ
	 * @param name ����ͬ�µ�����
	 */
	public abstract void send(String message,String name);
	
	/**
	 * �յ���Ϣ֪ͨ
	 * @param message ��Ϣ
	 */
	public abstract void notify(String message);
}
