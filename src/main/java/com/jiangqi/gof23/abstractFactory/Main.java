package com.jiangqi.gof23.abstractFactory;

public class Main {

	/**
	 * ���󹤳�ģʽ abstract factory
	 * ���ڲ�Ʒ��ʱ����Ҫ���������ÿ������ʵ���Լ��Ĳ�Ʒ
	 * ͨ�����⹤�����ṩ������ʵ�ֹ�������ͨ��ʵ�ֹ����ṩ����ʵ����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IFcatory fcatory;
		fcatory=AbstractFactory.getOneFactory();
		fcatory.getTest(0).doSomeThing();
		
		fcatory=AbstractFactory.getTwoFactory();
		fcatory.getTest(0).doSomeThing();
	}

}
