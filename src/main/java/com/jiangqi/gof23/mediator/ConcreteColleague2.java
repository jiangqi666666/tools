package com.jiangqi.gof23.mediator;

/**
 * 具体同事对象2
 * 
 * @author jiangqi
 *
 */
public class ConcreteColleague2 extends Colleague {
	public ConcreteColleague2(Mediator mediator,String name) {
		super(mediator,name);
	}

	@Override
	public void send(String message, String name) {

		this.mediator.send(message, name);
	}

	@Override
	public void notify(String message) {

		String str="【%s】得到消息：%s";
		System.out.println(String.format(str, this.name,message));
	}
}
