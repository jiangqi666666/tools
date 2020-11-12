package com.jiangqi.gof23.templatemethod;

/**
 * 模板类
 * @author jiangqi
 *
 */
public abstract class AbstractClass {

	public abstract void PrimitiveOperation1();
	public abstract void PrimitiveOperation2();
	
	/**
	 * 模板方法
	 */
	public void TemplateMethod(){
		PrimitiveOperation1();
		PrimitiveOperation2();
		System.out.println("统一方法");
	}
}
