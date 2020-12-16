package com.jiangqi.gof23.visitor;
/**
 * ���������1<br>
 * ʵ��ÿ����Visitor�����Ĳ�����ÿ������ʵ���㷨��һ���֣������㷨Ƭ�����Ƕ�Ӧ�ڽṹ�ж������
 * @see Visitor
 * */
public class ConcreteVisitor1 implements Visitor {

	@Override
	public void visitConcreteElementA(ConcreteElementA concreteElementA) {

		System.out.println(concreteElementA.getClass().getName()+"��"+this.getClass().getName()+"����");
	}

	@Override
	public void visitConcreteElementB(ConcreteElementB concreteElementB) {

		System.out.println(concreteElementB.getClass().getName()+"��"+this.getClass().getName()+"����");
	}

}
