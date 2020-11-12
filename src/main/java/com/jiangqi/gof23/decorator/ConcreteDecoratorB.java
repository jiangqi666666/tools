package com.jiangqi.gof23.decorator;

/**
 * 装饰者B<br>
 * 继承Decorator类，调用被装饰方法前或后对方法进行装饰<br>
 * 但最后还需调用Decorator的被装饰方法，以确保完成原有方法的调用
 * @author jiangqi
 * @see Decorator
 */
public class ConcreteDecoratorB extends Decorator {

	
	@Override
	public void Operation() {
		// TODO Auto-generated method stub
		super.Operation();
		AddedBehavior();
		System.out.println("具体装饰对象B的操作");
	}
	
	/**
	 * 装饰者B添加的装饰方法
	 */
	private void AddedBehavior(){
		System.out.println("装饰B添加的功能");
	}
}