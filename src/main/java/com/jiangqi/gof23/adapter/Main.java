package com.jiangqi.gof23.adapter;

public class Main {

	/**
	 * ������ģʽ��Adapter
	 * ��һ����Ľӿ�ת���ɿͻ�ϣ��������һ���ӿڣ���ģʽʹ��ԭ�����ڽӿڲ����ݶ�����һ��������Щ�����һ����
	 */
	public static void main(String[] args) {
		
		//���������װ����ʾ
		System.out.println("���������װ����ʾ");
		Target tar=new Target();
		tar.request();
		tar.request1();
		System.out.println();
		
		//�������װ����ʾ
		System.out.println("�������װ����ʾ");
		tar=new Adapter();
		tar.request();
		tar.request1();
	}

}
