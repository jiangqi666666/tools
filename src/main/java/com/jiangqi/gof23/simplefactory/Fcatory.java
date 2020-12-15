package com.jiangqi.gof23.simplefactory;

/**
 * 简单工厂
 * @author jiangqi
 *
 */
public class Fcatory {

	/**
	 * 工厂根据索引创建对应实例
	 * @param i 索引
	 * @return
	 */
	public static ITest  getTest(int i) {
		// TODO Auto-generated method stub
		switch(i){
		case 0:
			return new OneTest();
		case 1:
			return new TwoTest();
		default:
			return null;
		}
	}

	

}
