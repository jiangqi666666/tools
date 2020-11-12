package com.jiangqi.gof23.mediator;

/**
 * 抽象同事类
 */
public abstract class Colleague {
	protected Mediator mediator;
	protected String name;

	public Colleague(Mediator mediator,String name) {
		this.mediator = mediator;
		this.name=name;
	}
	
	/**
	 * 向其他同事发出消息
	 * @param message 消息
	 * @param name 其他同事的名字
	 */
	public abstract void send(String message,String name);
	
	/**
	 * 收到消息通知
	 * @param message 消息
	 */
	public abstract void notify(String message);
}
