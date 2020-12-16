package com.jiangqi.gof23.singleton;

public class Main {

	/**
	 * 单例模式：Singleton
	 * 保证一个类仅有一个实例，并提供一个访问它的全局访问点
	 */
	public static void main(String[] args) {

		Singleton s1=Singleton.GetInstance();
		Singleton s2=Singleton.GetInstance();
		if(s1==s2)
			System.out.println("两个对象是相同是实例");
	}
}
