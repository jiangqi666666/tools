package com.jiangqi.gof23.adapter;

public class Main {

	/**
	 * ������ģʽ��Adapter
	 * ��һ����Ľӿ�ת���ɿͻ�ϣ��������һ���ӿڣ���ģʽʹ��ԭ�����ڽӿڲ����ݶ�����һ��������Щ�����һ����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���������װ����ʾ
		System.out.println("���������װ����ʾ");
		Target tar=new Target();
		tar.Request();
		tar.Request1();
		System.out.println();
		
		//�������װ����ʾ
		System.out.println("�������װ����ʾ");
		tar=new Adapter();
		tar.Request();
		tar.Request1();
	}

}
