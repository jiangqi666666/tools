package com.jiangqi.gof23.abstractfactory;

public class Main {

	/**
	 * ���󹤳�ģʽ abstract factory
	 * ���ڲ�Ʒ��ʱ����Ҫ���������ÿ������ʵ���Լ��Ĳ�Ʒ
	 * ͨ�����⹤�����ṩ������ʵ�ֹ�������ͨ��ʵ�ֹ����ṩ����ʵ����
	 */
	public static void main(String[] args) {
		
		IFcatory fcatory;
		fcatory=AbstractFactory.getOneFactory();
		fcatory.getTest(0).doSomeThing();
		
		fcatory=AbstractFactory.getTwoFactory();
		fcatory.getTest(0).doSomeThing();
	}

}
