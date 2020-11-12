package com.jiangqi.gof23.adapter;

public class Main {

	/**
	 * 适配器模式：Adapter
	 * 将一个类的接口转换成客户希望的另外一个接口，本模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//不被适配包装的演示
		System.out.println("不被适配包装的演示");
		Target tar=new Target();
		tar.Request();
		tar.Request1();
		System.out.println();
		
		//被适配包装的演示
		System.out.println("被适配包装的演示");
		tar=new Adapter();
		tar.Request();
		tar.Request1();
	}

}
