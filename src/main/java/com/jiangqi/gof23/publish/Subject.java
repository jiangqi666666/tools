package com.jiangqi.gof23.publish;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ���� ������
 * @author jiangqi
 *
 */
public abstract class Subject {
	private ArrayList<Observer> Observers=new ArrayList<Observer>();
	
	/**
	 * ��ӹ۲���
	 * @param observer �۲���
	 */
	public void attach(Observer observer){
		this.Observers.add(observer);
	}
	
	/**
	 * �Ƴ��۲���
	 * @param observer �۲���
	 */
	public void detach(Observer observer){
		this.Observers.remove(observer);
	}
	
	/**
	 * ����֪ͨ
	 */
	public void publish(){
		Iterator<Observer> its=this.Observers.iterator();
		Observer obj;
		while(its.hasNext()){
			obj=its.next();
			obj.update();
		}
	}
}
