package com.jiangqi.gof23.adapter;

/**
 * 适配的目标类
 * @author jiangqi
 *
 */
public class Target {
	
	/**
	 * 适配目标类的原有执行方法,会被适配类包装修改
	 */
	public void request(){
		System.out.println("Target的原有方法，Request");
	}
	
	/**
	 * 适配目标类的原有执行方法,不会被适配类包装修改
	 */
	public void request1(){
		System.out.println("Target的原有方法，Request1");
	}
}
