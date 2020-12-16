package com.jiangqi.gof23.facade;

/**
 * ����ģʽʵ����
 * @author jiangqi
 *
 */
public class Facade {

	SubSystemOne one=new SubSystemOne();
	SubSystemTwo two=new SubSystemTwo();
	
	/**
	 * ������ϵͳone�ķ���MethodOne
	 */
	public void methodA(){
		this.one.methodOne();
	}

	/**
	 * ������ϵͳtwo�ķ���MethodOne��MethodTwo
	 */
	public void methodB(){
		this.two.methodOne();
		this.two.methodTwo();
	}
}
