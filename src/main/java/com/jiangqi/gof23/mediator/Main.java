package com.jiangqi.gof23.mediator;

public class Main {

	/**
	 * �н���ģʽ��Mediator
	 * ��һ���н��������װһϵ�еĶ��󽻻����н���ʹ��������Ҫ��ʾ���໥���ã��Ӷ�ʹ������ϣ�
	 * ���ҿ��Զ����ı����ǵĽ���
	 * 
	 * ͬ������ϵ���ӣ�Ϊ��״��ʽ��ͨ���н�ģʽ��ȡ��һ���н��ཫ��Щ��ϵ�����״��
	 */
	public static void main(String[] args) {

		ConcreteMediator m=new ConcreteMediator();
		
		ConcreteColleague1 c1=new ConcreteColleague1(m,"ͬ��1");
		ConcreteColleague2 c2=new ConcreteColleague2(m,"ͬ��2");
		ConcreteColleague2 c3=new ConcreteColleague2(m,"ͬ��3");
		
		m.addColleague(c1).addColleague(c2).addColleague(c3);
		
		c1.send("�Թ���û��", "ͬ��2");
		c2.send("1Ҫ�����ǳԷ���","ͬ��3");
		c3.send("�������ͣ�","ͬ��1");
		
	}

}
