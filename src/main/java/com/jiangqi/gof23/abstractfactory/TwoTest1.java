package com.jiangqi.gof23.abstractfactory;

/**
 * two工厂的一个产品
 * @author jiangqi
 * @see ITest
 */
public class TwoTest1 implements ITest {

	@Override
	public void doSomeThing( ) {
		
		System.out.println("this is TwoTest1 do");
	}

}
