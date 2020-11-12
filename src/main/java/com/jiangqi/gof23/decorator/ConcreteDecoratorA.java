package com.jiangqi.gof23.decorator;

/**
 * 装饰者A<br>
 * 继承Decorator类，调用被装饰方法前或后对方法进行装饰<br>
 * 但最后还需调用Decorator的被装饰方法，以确保完成原有方法的调用
 * @author jiangqi
 * @see Decorator
 */
public class ConcreteDecoratorA extends Decorator {

	private String addedState;

	@Override
	public void Operation() {
		// TODO Auto-generated method stub
		super.Operation();
		this.addedState="New State";
		System.out.println("具体装饰对象A的操作："+this.addedState);
	}
	
}
