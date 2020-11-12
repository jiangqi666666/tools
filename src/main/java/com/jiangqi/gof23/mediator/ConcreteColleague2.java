package com.jiangqi.gof23.mediator;

/**
 * ����ͬ�¶���2
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
		// TODO Auto-generated method stub
		this.mediator.send(message, name);
	}

	@Override
	public void notify(String message) {
		// TODO Auto-generated method stub
		String str="��%s���õ���Ϣ��%s";
		System.out.println(str.format(str, this.name,message));
	}
}
