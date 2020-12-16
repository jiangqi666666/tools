package com.jiangqi.gof23.templatemethod;

/**
 * 模板类
 * @author jiangqi
 *
 */
public abstract class AbstractClass {

	public abstract void primitiveOperation1();
	public abstract void primitiveOperation2();
	
	/**
	 * 模板方法
	 */
	public void templateMethod(){
		primitiveOperation1();
		primitiveOperation2();
		System.out.println("统一方法");
	}
}
