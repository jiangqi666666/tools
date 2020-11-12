package com.jiangqi.gof23.chainofresponsibility;

public class Main {

	/**
	 * Chain of Responsibility:ְҵ��ģʽ
	 * ʹ��������л��ᴦ�����󣬴Ӷ���������ķ����ߺͽ�����֮�����Ϲ�ϵ���������������һ������
	 * ��������������������ֱ����һ����������Ϊֹ
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
