package com.jiangqi.gof23.mediator;

/**
 * 中介接口
 * @author jiangqi
 *
 */
public interface Mediator {
	
	/**
	 * 抽象发送消息方法
	 * @param message 消息
	 * @param name 接受消息的同事名
	 */
	public void send(String message,String name);
	
	/**
	 * 添加需要中介的同事
	 * @param colleague
	 */
	public Mediator addColleague(Colleague colleague);
}
