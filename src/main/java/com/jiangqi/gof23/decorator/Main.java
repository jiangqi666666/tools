package com.jiangqi.gof23.decorator;

public class Main {

	/**
	 * decorator:װ��ģʽ
	 * ���ض��ĳ�������������Ҫ����¹��ܣ���Щ�¼ӵĴ���ͨ��װ����ԭ����ĺ���ְ�����Ҫ��Ϊ��
	 * ���ǲ�ͬ�ĳ��Ͽͻ��˿��Ը�����Ҫ��ѡ���߲�ʹ������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * ConcreteComponents��ԭ���࣬
		 * IComponent ��������Ҫװ�εķ���
		 * Decorator����װ����ĸ��࣬��ɱ�װ�ε�IComponent�����ĵ��ã�ͨ��������ԭ�й��ܵ�ʵ�֣�
		 * ConcreteDecoratorA��ConcreteDecoratorB���ڲ�������Decorator��ԭ���������ڷ�����������Լ�����������
		 * 
		 * main������Ը����������Ҫ�������������չԭConcreteComponents�����ݣ�
		 * ��ԭConcreteComponents�������޸ġ�
		 */
		
		ConcreteComponent c=new ConcreteComponent();
		ConcreteDecoratorA d1=new ConcreteDecoratorA();
		ConcreteDecoratorB d2=new ConcreteDecoratorB();
		
		//��������
		System.out.println("��������-----");
		c.Operation();
		System.out.println("-----");
		System.out.println();
		
		//ͨ��A����
		System.out.println("A����-----");
		d1.setComponent(c);
		d1.Operation();
		System.out.println("-----");
		System.out.println();
		
		//ͨ��A,B����
		System.out.println("A,B����-----");
		d1.setComponent(c);
		d2.setComponent(d1);
		d2.Operation();
		
	}

}
