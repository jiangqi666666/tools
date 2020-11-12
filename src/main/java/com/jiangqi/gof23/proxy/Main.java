package com.jiangqi.gof23.proxy;

import java.lang.reflect.Proxy;

public class Main {

	/**
	 * proxy ����ģʽ 
	 * 1��Զ�̴���Ϊһ�������ڲ�ͬ�ĵ�ַ�ռ��ṩ�ֲ�����������һ����������ڲ�ͬ��ַ�ռ����ʵ��
	 * 2����������Ǹ�����Ҫ���������ܴ�Ķ���ͨ���������ʵ������Ҫ�ܳ�ʱ�����ʵ���� 
	 * 3����ȫ��������������ʵ�������ʱ��Ȩ�ޣ�
	 * 4������ָ����ָ������ʵ����ʱ������������һЩ��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ͨ������ʾ
		System.out.println("��ͨ������ʾ");
		ProxyGeneral proxy = new ProxyGeneral();
		proxy.request();

		// ��̬������ʾ
		System.out.println("jdk��̬������ʾ");
		
		Subject real=new RealSubject();
		ProxyHandler handler=new ProxyHandler(real);
		Subject proxySubject = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(),
				real.getClass().getInterfaces(), handler);

		proxySubject.request();

	}

}
