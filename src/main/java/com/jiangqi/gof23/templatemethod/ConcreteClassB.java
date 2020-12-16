package com.jiangqi.gof23.templatemethod;

/**
 * 模板实现类B
 * @author jiangqi
 * @see AbstractClass
 */
public class ConcreteClassB extends AbstractClass {

	@Override
	public void primitiveOperation1() {

		System.out.println("具体类B方法1实现");
	}

	@Override
	public void primitiveOperation2() {

		System.out.println("具体类B方法2实现");
	}

}
