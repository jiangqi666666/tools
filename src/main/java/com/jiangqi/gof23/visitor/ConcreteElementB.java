package com.jiangqi.gof23.visitor;

public class ConcreteElementB implements Element {

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visitConcreteElementB(this);
	}
}

