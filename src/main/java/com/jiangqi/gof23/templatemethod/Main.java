package com.jiangqi.gof23.templatemethod;

public class Main {

	/**
	 * 模板模式：TemplateMethods
	 * 模板方法模式是通过把不变行为搬移到超类，去除子类中的重复代码来体现优势；
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClass c;
		c=new ConcreteClassA();
		c.TemplateMethod();
		
		c=new ConcreteClassB();
		c.TemplateMethod();
	}

}
