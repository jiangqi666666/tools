package com.jiangqi.gof23.decorator;

public class Main {

	/**
	 * decorator:装饰模式
	 * 在特定的场合下已有类需要添加新功能，这些新加的代码通常装饰了原有类的核心职责或主要行为，
	 * 但是不同的场合客户端可以根据需要挑选或者不使用修饰
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * ConcreteComponents是原有类，
		 * IComponent 抽象了需要装饰的方法
		 * Decorator类是装饰类的父类，完成被装饰的IComponent方法的调用（通过他保障原有功能的实现）
		 * ConcreteDecoratorA、ConcreteDecoratorB，内部调用了Decorator的原方法，并在方法体内添加自己的修饰内容
		 * 
		 * main程序可以根据自身的需要添加修饰类来扩展原ConcreteComponents的内容，
		 * 而原ConcreteComponents类无需修改。
		 */
		
		ConcreteComponent c=new ConcreteComponent();
		ConcreteDecoratorA d1=new ConcreteDecoratorA();
		ConcreteDecoratorB d2=new ConcreteDecoratorB();
		
		//无需修饰
		System.out.println("无需修饰-----");
		c.Operation();
		System.out.println("-----");
		System.out.println();
		
		//通过A修饰
		System.out.println("A修饰-----");
		d1.setComponent(c);
		d1.Operation();
		System.out.println("-----");
		System.out.println();
		
		//通过A,B修饰
		System.out.println("A,B修饰-----");
		d1.setComponent(c);
		d2.setComponent(d1);
		d2.Operation();
		
	}

}
