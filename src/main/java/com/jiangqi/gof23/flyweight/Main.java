package com.jiangqi.gof23.flyweight;

public class Main {

	/**
	 * ��Ԫģʽ��Flyweight
	 * ���ù�������Ч֧�ִ���ϸ���ȶ���
	 * 
	 * ������Ķ�����ʵ�������ڴ��У��ͻ�������ʱϵͳ���ؿ���ʵ��������������ʵ���򴴽�֮����������ӹ����
	 * 
	 * Ҳ����˵��һ��ϵͳ������ж����ͬ�Ķ�����ôֻ����һ�ݾͿ����ˣ�����ÿ����ȥʵ����һ������
	 * ����˵һ���ı�ϵͳ��ÿ����ĸ��һ��������ô��Сд��ĸһ������52������ô��Ҫ����52������
	 * �����һ��1M���ı�����ô��ĸ�Ǻ���Ķ࣬���ÿ����ĸ������һ��������ô�ڴ���ͱ��ˡ�
	 * ��ô���Ҫ��ÿ����ĸ������һ��������ô�ʹ���Լ����Դ��
	 * ��Flyweightģʽ�У�����Ҫ�������ָ����Ķ���������Flyweight(��Ԫ)ģʽ�г�����Factoryģʽ��
	 * Flyweight���ڲ�״̬�����������,
	 * Flyweight factory����ά��һ������洢�أ�Flyweight Pool��������ڲ�״̬�Ķ���
	 * Flyweightģʽ��һ����߳���Ч�ʺ����ܵ�ģʽ,����ӿ����������ٶ�.Ӧ�ó��Ϻࣺܶ
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FlyweightFactory f=new FlyweightFactory();
		
		IFlyweight fx=f.getFlyWeight("X");
		fx.Operation();
		
		fx=f.getFlyWeight("Y");
		fx.Operation();
		
		fx=f.getFlyWeight("Z");
		fx.Operation();
		
		fx=f.getFlyWeight("Z");
		fx.Operation();
		
		fx=f.getFlyWeight("X");
		fx.Operation();
		
		System.out.println("��Ԫ������"+f.getFlyweightSize());
		
	}

}
