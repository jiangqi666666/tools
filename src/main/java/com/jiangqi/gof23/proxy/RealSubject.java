package com.jiangqi.gof23.proxy;

public class RealSubject implements Subject {

	@Override
	public void request() {
		// TODO Auto-generated method stub
		System.out.println("真实的请求");
	}

}
