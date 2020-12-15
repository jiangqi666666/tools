package com.jiangqi.gof23.abstractfactory;

/**
 * One工厂的一个产品
 * @author jiangqi
 *@see ITest
 */
public class OneTest implements ITest {

	@Override
	public void doSomeThing() {
		
		System.out.println("this is OneTest do");
	}

}
