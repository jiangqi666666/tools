package com.jiangqi.gof23.abstractFactory;

/**
 * ���⹤����
 * @author jiangqi
 *
 */
public   class  AbstractFactory {
	
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
