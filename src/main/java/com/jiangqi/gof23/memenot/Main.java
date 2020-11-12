package com.jiangqi.gof23.memenot;

public class Main {

	/**
	 * ����¼ģʽ��Memento
	 * �ڲ��ƻ���װ�Ե�ǰ���£�����һ��������ڲ�״̬�����ڸö���֮�Ᵽ�����״̬��
	 * �����Ժ�Ϳ��Խ��ö���ָ���ԭ�ȱ����״̬��
	 * ��ģʽ�Ƚ������ڹ��ܱȽϸ��ӣ�����Ҫά�����¼������ʷ���࣬������Ҫ���������ֻ���ڶ�
	 * �����е�һС���֣�Originator���Ը��ݱ����Memento��Ϣ��ԭ��ǰһ״̬
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Originator o=new Originator();
		o.setState("On");//����ʼ״̬����ΪOn
		o.show();
		
		Storage c=new Storage();
		c.setMemento(o.createMemento());
		
		o.setState("Off");//����ʼ״̬����ΪOff
		o.show();
		
		o.setMemento(c.getMemento());//�ָ�ԭʼ״̬
		o.show();
	}

}
