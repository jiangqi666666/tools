package com.jiangqi.gof23.decorator;

/**
 * ��������ִ�����ʵ��
 * @author jiangqi
 * @see IComponent
 */
public class ConcreteComponent implements IComponent {

	@Override
	public void operation() {

		System.out.println("�������Ĳ���");
	}

}
