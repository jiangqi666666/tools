package com.jiangqi.gof23.abstractfactory;

/**
 * two工厂的一个产品
 * @author jiangqi
 * @see ITest
 */
public class TwoTest implements ITest {

	@Override
	public void doSomeThing() {
		
		System.out.println("this is TwoTest do");
	}

}
