package com.jiangqi.gof23.templatemethod;

/**
 * ģ����
 * @author jiangqi
 *
 */
public abstract class AbstractClass {

	public abstract void PrimitiveOperation1();
	public abstract void PrimitiveOperation2();
	
	/**
	 * ģ�巽��
	 */
	public void TemplateMethod(){
		PrimitiveOperation1();
		PrimitiveOperation2();
		System.out.println("ͳһ����");
	}
}
