package com.jiangqi.gof23.visitor;
/**
 * 抽象的访问类<br>
 *  为该对象结构中具体元素角色声明一个访问操作接口.<br>
 * 为该对象结构中ConcreteElement的每一个类声明一个visit操作
 * */
public interface  Visitor {
	
	/**
	 * 访问ConcreteElementA的操作
	 * @param concreteElementA
	 */
	public  void visitConcreteElementA(ConcreteElementA concreteElementA);
	
	/**
	 * 访问ConcreteElementB的操作
	 * @param concreteElementB
	 */
	public  void visitConcreteElementB(ConcreteElementB concreteElementB);
}
