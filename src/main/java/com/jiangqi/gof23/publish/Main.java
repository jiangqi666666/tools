package com.jiangqi.gof23.publish;

public class Main {

	/**
	 * publish/subscribe �۲���ģʽ
	 * �۲���ģʽ������һ��һ�Զ��������ϵ���ö���۲��߶���ͬʱ����ĳһ��
	 * �������������������״̬�仯ʱ����֪ͨ���й۲��߶���ʹ���ܹ��Զ������Լ���
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteSubject s=new ConcreteSubject();
		s.attach(new ConcreteObserver(s,"X"));
		s.attach(new ConcreteObserver(s,"Y"));
		s.attach(new ConcreteObserver(s,"Z"));
		
		s.setSubjectState("ABC");
		s.publish();
	}
}
