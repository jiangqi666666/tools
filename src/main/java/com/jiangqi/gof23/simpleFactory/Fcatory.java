package com.jiangqi.gof23.simpleFactory;

/**
 * �򵥹���
 * @author jiangqi
 *
 */
public class Fcatory {

	/**
	 * ������������������Ӧʵ��
	 * @param i ����
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
