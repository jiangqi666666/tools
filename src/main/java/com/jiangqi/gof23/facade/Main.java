package com.jiangqi.gof23.facade;

public class Main {

	/**
	 * 外观模式：Facade
	 * 为子系统中的一组接口提供一个一致的界面，此模式定义了一个高层接口，这个接口使得
	 * 这一子系统更加容易使用（比如通过分层设计，减少类之间的互相直接引用）
	 * 
	 * 1、设计初期，应该要有意识的将不同的两个层分离，层与层之间的通讯采用外观模式；
	 * 2、开发阶段，子系统不断重构演变的越来越复杂，通过外观模式提供一个简单的接口，减少它们间的依赖
	 * 3、新系统要使用一个遗留的大系统时，通过开发一个外观模式类来封装与老系统的交互
	 * 4、只暴露遗留系统中一部分内容给新系统而不用全部暴露
	 */
	public static void main(String[] args) {

		Facade test=new Facade();
		test.methodA();
		test.methodB();
	}

}
