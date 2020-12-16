package com.jiangqi.gof23.decorator;

import lombok.Getter;
import lombok.Setter;

/**
 * װ����A<br>
 * �̳�Decorator�࣬���ñ�װ�η���ǰ���Է�������װ��<br>
 * ����������Decorator�ı�װ�η�������ȷ�����ԭ�з����ĵ���
 * @author jiangqi
 * @see Decorator
 */
@Setter
@Getter
public class ConcreteDecoratorA extends Decorator {

	private String addedState;

	@Override
	public void operation() {

		super.operation();
		this.addedState="New State";
		System.out.println("����װ�ζ���A�Ĳ�����"+this.addedState);
	}
	
}
