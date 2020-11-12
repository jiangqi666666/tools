package com.jiangqi.gof23.chainofresponsibility;

public class Main {

	/**
	 * Chain of Responsibility:职业链模式
	 * 使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系，将这个对象连成一条链，
	 * 并沿着这条链传递请求，直到有一个对象处理它为止
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Handler h1=new ConcreteHandler1();
		Handler h2=new ConcreteHandler2();
		Handler h3=new ConcreteHandler3();
		
		h1.setSuccessor(h2);
		h2.setSuccessor(h3);
		
		int[] requests={2,5,14,22,18,3,27,20};
		for(int i=0;i<requests.length;i++)
			h1.HandleRequest(requests[i]);
	}
}
