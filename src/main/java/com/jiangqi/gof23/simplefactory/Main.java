package com.jiangqi.gof23.simplefactory;

public class Main {

	/**
	 * �򵥹���ģʽ simple factory
	 * ���οͻ��˳�ʼ��������࣬�����������
	 */
	public static void main(String[] args) {

		ITest test;
		test=Fcatory.getTest(0);
		test.doSomeThing();
		
		test=Fcatory.getTest(1);
		test.doSomeThing();
	}

}
