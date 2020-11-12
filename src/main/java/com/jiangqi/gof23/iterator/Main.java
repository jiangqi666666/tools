package com.jiangqi.gof23.iterator;

public class Main {

	/**
	 * ������ģʽ��Iterator
	 * �ṩһ�ַ���˳�����һ���ۺ϶����и���Ԫ�أ����ֲ���¶�ö�����ڲ���ʾ
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteAggregate<String> a=new ConcreteAggregate<String>();
		a.addObjectByIndex(0, "����");
		a.addObjectByIndex(1, "����1");
		a.addObjectByIndex(2, "����2");
		a.addObjectByIndex(3, "����3");
		a.addObjectByIndex(4, "����4");
		a.addObjectByIndex(5, "����5");
		a.addObject("����6");
		a.addObject("����7");
		
		//Iterator i=new ConcreteIterator(a);
		Iterator<String> i=a.createIterator();
		i.first();
		while(!i.isDone()){
			System.out.println(i.currentItem()+"����Ʊ��");
			i.next();
		}
		
	}

}
