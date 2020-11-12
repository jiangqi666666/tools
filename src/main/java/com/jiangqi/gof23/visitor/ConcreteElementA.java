package com.jiangqi.gof23.visitor;

/**
 * 具体元素角色A<br>
 * 实现由元素角色提供的accept操作
 * @author jiangqi
 * @see Element
 */
public class ConcreteElementA implements Element {

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visitConcreteElementA(this);
	}
}
