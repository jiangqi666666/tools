package com.jiangqi.gof23.templatemethod;

public class Main {

	/**
	 * ģ��ģʽ��TemplateMethods
	 * ģ�巽��ģʽ��ͨ���Ѳ�����Ϊ���Ƶ����࣬ȥ�������е��ظ��������������ƣ�
	 * 
	 */
	public static void main(String[] args) {

		AbstractClass c;
		c=new ConcreteClassA();
		c.templateMethod();
		
		c=new ConcreteClassB();
		c.templateMethod();
	}

}
