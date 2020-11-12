package com.jiangqi.gof23.facade;

/**
 * 门面模式实现类
 * @author jiangqi
 *
 */
public class Facade {

	SubSystemOne one=new SubSystemOne();
	SubSystemTwo two=new SubSystemTwo();
	
	/**
	 * 调用子系统one的方法MethodOne
	 */
	public void MethodA(){
		this.one.MethodOne();
	}

	/**
	 * 调用子系统two的方法MethodOne和MethodTwo
	 */
	public void MethodB(){
		this.two.MethodOne();
		this.two.MethodTwo();
	}
}
