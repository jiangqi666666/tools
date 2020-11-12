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
	public void MethodA(){
		this.one.MethodOne();
	}

	/**
	 * ������ϵͳtwo�ķ���MethodOne��MethodTwo
	 */
	public void MethodB(){
		this.two.MethodOne();
		this.two.MethodTwo();
	}
}
