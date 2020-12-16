package com.jiangqi.gof23.templatemethod;

/**
 * 模板实现类A
 * @author jiangqi
 * @see AbstractClass
 */
public class ConcreteClassA extends AbstractClass {

	@Override
	public void primitiveOperation1() {
		
		System.out.println("具体类A方法1实现");
	}

	@Override
	public void primitiveOperation2() {
		
		System.out.println("具体类A方法2实现");
	}

}
