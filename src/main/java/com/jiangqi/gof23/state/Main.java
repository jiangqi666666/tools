package com.jiangqi.gof23.state;

public class Main {

	/**
	 * ״̬ģʽ��State
	 * ��һ�����������״̬�ı�ʱ����ı�������Ϊ����������������Ǹ��������ࣻ
	 * ״̬ģʽ��Ҫ������ǵ�����һ������״̬ת�����������ʽ���ڸ��ӵ�ʱ�򣬰�
	 * ״̬���ж��߼�ת�Ƶ���ʾ��ͬ״̬��һϵ���൱�У����԰Ѹ��ӵ��ж��߼��򻯣����жϺܼ򵥾Ͳ���ʹ�ô�ģʽ����
	 * ���ض�״̬�����Ϊ��ŵ���ͬ��ConcreteState�����У�ͨ�������µ�����Ϳ��Ժ����׵������µ�״̬��ת����
	 * 
	 * ���״̬ģʽ���Լ��ĳ������·�ʽ
	 * 1��ʵ��״̬����3���¼�
	 * 2��ͨ��Ԥ�����״̬���ԣ�ͨ���¼���ʽ�Զ����״̬
	 */
	public static void main(String[] args) {

		StateMachine c=new StateMachine();
		Context context=new Context();
		
		String tmp="-------------";
	
		c.changeState(context,"start");
		System.out.println(tmp);
		
		c.changeState(context,"a1");
		System.out.println(tmp);
		
		c.changeState(context,"b1");
		
		System.out.println(tmp);
		c.changeState(context,"a2");
		
		System.out.println(tmp);
		
		c.changeState(context,"start");
		c.changeState(context,"a1");
		c.changeState(context,"b1");
		c.changeState(context,"a2");
	}

}
