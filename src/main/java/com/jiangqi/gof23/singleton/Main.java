package com.jiangqi.gof23.singleton;

public class Main {

	/**
	 * ����ģʽ��Singleton
	 * ��֤һ�������һ��ʵ�������ṩһ����������ȫ�ַ��ʵ�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s1=Singleton.GetInstance();
		Singleton s2=Singleton.GetInstance();
		if(s1==s2)
			System.out.println("������������ͬ��ʵ��");
	}
}
