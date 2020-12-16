package com.jiangqi.gof23.simplefactory;

public class Main {

	/**
	 * 简单工厂模式 simple factory
	 * 屏蔽客户端初始化具体的类，交给工厂完成
	 */
	public static void main(String[] args) {

		ITest test;
		test=Fcatory.getTest(0);
		test.doSomeThing();
		
		test=Fcatory.getTest(1);
		test.doSomeThing();
	}

}
