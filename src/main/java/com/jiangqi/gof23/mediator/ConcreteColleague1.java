package com.jiangqi.gof23.mediator;

/**
 * ����ͬ�¶���1
 * 
 * @author jiangqi
 *
 */
public class ConcreteColleague1 extends Colleague {
	public ConcreteColleague1(Mediator mediator,String name) {
		super(mediator,name);
	}

	@Override
	public void send(String message, String name) {

		this.mediator.send(message, name);
	}

	@Override
	public void notify(String message) {

		String str="��%s���õ���Ϣ��%s";
		System.out.println(String.format(str, this.name,message));
	}

}
