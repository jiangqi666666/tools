package com.jiangqi.gof23.visitor;

/**
 * ����Ԫ�ؽ�ɫA<br>
 * ʵ����Ԫ�ؽ�ɫ�ṩ��accept����
 * @author jiangqi
 * @see Element
 */
public class ConcreteElementA implements Element {

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visitConcreteElementA(this);
	}
}
