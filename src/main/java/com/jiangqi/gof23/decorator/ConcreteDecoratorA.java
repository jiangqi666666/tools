package com.jiangqi.gof23.decorator;

/**
 * װ����A<br>
 * �̳�Decorator�࣬���ñ�װ�η���ǰ���Է�������װ��<br>
 * ����������Decorator�ı�װ�η�������ȷ�����ԭ�з����ĵ���
 * @author jiangqi
 * @see Decorator
 */
public class ConcreteDecoratorA extends Decorator {

	private String addedState;

	@Override
	public void Operation() {
		// TODO Auto-generated method stub
		super.Operation();
		this.addedState="New State";
		System.out.println("����װ�ζ���A�Ĳ�����"+this.addedState);
	}
	
}
