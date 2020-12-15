package com.jiangqi.gof23.abstractfactory;

public class Main {

	/**
	 * 抽象工厂模式 abstract factory
	 * 存在产品族时，需要多个工厂，每个工厂实现自己的产品
	 * 通过虚拟工厂先提供出具体实现工厂，再通过实现工厂提供具体实现类
	 */
	public static void main(String[] args) {
		
		IFcatory fcatory;
		fcatory=AbstractFactory.getOneFactory();
		fcatory.getTest(0).doSomeThing();
		
		fcatory=AbstractFactory.getTwoFactory();
		fcatory.getTest(0).doSomeThing();
	}

}
