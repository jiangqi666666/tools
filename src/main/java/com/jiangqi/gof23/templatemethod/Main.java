package com.jiangqi.gof23.templatemethod;

public class Main {

	/**
	 * ģ��ģʽ��TemplateMethods
	 * ģ�巽��ģʽ��ͨ���Ѳ�����Ϊ���Ƶ����࣬ȥ�������е��ظ��������������ƣ�
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClass c;
		c=new ConcreteClassA();
		c.TemplateMethod();
		
		c=new ConcreteClassB();
		c.TemplateMethod();
	}

}
