package com.jiangqi.gof23.visitor;

public class Main {

	/**
	 * ������ģʽ��Visitor
	 * ��ʾһ��������ĳ����ṹ�еĸ�Ԫ�صĲ�������ʹ������ڲ��ı��Ԫ�ص����ǰ���¶�����������ЩԪ�ص��²���
	 * 
	 * �Ӷ�����Կ����ṹ������ʹ�÷�����ģʽ�ıر���������������ṹ���������ڱ��������������ķ�����
	 * ������Java�е�Collection��
	 * ������ģʽ��Ŀ����Ҫ�Ѵ�������ݽṹ�з�����������ϵͳ�бȽ��ȶ������ݽṹ���������ڱ仯���㷨�Ļ���
	 * ʹ�÷�����ģʽ�Ǹ������ѡ����Ϊ������ģʽʹ���㷨���������ӱ�����ס�
	 * �෴�����ϵͳ�����ݽṹ���ȶ������ڱ仯�����ϵͳ�Ͳ��ʺ�ʹ�÷�����ģʽ�ˡ�
	 * 
	 * http://www.cnblogs.com/draem0507/p/3795158.html
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectStructure o=new ObjectStructure();
		o.attach(new ConcreteElementA());
		o.attach(new ConcreteElementB());
		
		ConcreteVisitor1 v1=new ConcreteVisitor1();
		ConcreteVisitor2 v2=new ConcreteVisitor2();
		
		o.accpet(v1);
		o.accpet(v2);
	}

}
