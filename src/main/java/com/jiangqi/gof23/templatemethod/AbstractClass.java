package com.jiangqi.gof23.templatemethod;

/**
 * ģ����
 * @author jiangqi
 *
 */
public abstract class AbstractClass {

	public abstract void primitiveOperation1();
	public abstract void primitiveOperation2();
	
	/**
	 * ģ�巽��
	 */
	public void templateMethod(){
		primitiveOperation1();
		primitiveOperation2();
		System.out.println("ͳһ����");
	}
}
