package com.jiangqi.gof23.facade;

public class Main {

	/**
	 * ���ģʽ��Facade
	 * Ϊ��ϵͳ�е�һ��ӿ��ṩһ��һ�µĽ��棬��ģʽ������һ���߲�ӿڣ�����ӿ�ʹ��
	 * ��һ��ϵͳ��������ʹ�ã�����ͨ���ֲ���ƣ�������֮��Ļ���ֱ�����ã�
	 * 
	 * 1����Ƴ��ڣ�Ӧ��Ҫ����ʶ�Ľ���ͬ����������룬�����֮���ͨѶ�������ģʽ��
	 * 2�������׶Σ���ϵͳ�����ع��ݱ��Խ��Խ���ӣ�ͨ�����ģʽ�ṩһ���򵥵Ľӿڣ��������Ǽ������
	 * 3����ϵͳҪʹ��һ�������Ĵ�ϵͳʱ��ͨ������һ�����ģʽ������װ����ϵͳ�Ľ���
	 * 4��ֻ��¶����ϵͳ��һ�������ݸ���ϵͳ������ȫ����¶
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Facade test=new Facade();
		test.MethodA();
		test.MethodB();
	}

}