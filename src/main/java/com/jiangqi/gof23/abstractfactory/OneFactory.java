package com.jiangqi.gof23.abstractfactory;

/**
 * ����One����
 * @author jiangqi
 * @see IFcatory
 */
public class OneFactory implements IFcatory {


	@Override
	public ITest getTest(int i) {
		
		switch(i){
		case 0:
			return new OneTest();
		case 1:
			return new OneTest1();
		default:
			return null;
		}
	}

}
