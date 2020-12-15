package com.jiangqi.gof23.abstractfactory;

/**
 * ���⹤����
 * @author jiangqi
 *
 */
public   class  AbstractFactory {
	
	/**
	 * 
	 */
	private AbstractFactory() {
		throw new IllegalStateException("Utility class");
	}
	
	/**
	 * ��þ���One����
	 * @return ͳһ�����ӿ�
	 */
	public static IFcatory getOneFactory(){
		return new OneFactory();
	}
	
	/**
	 * ��þ���Two����
	 * @return ͳһ�����ӿ�
	 */
	public static  IFcatory getTwoFactory(){
		return new TwoFactory();
	}
}
