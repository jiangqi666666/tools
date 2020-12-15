package com.jiangqi.gof23.abstractfactory;

/**
 * 具体Two工厂
 * @author jiangqi
 * @see IFcatory
 */
public class TwoFactory implements IFcatory {

	@Override
	public ITest getTest(int i) {
		// TODO Auto-generated method stub
		switch(i){
		case 0:
			return new TwoTest();
		case 1:
			return new TwoTest1();
		default:
			return null;
		}
	}

}
