package com.jiangqi.gof23.publish;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 主题 抽象类
 * @author jiangqi
 *
 */
public abstract class Subject {
	private ArrayList<Observer> Observers=new ArrayList<Observer>();
	
	/**
	 * 添加观察者
	 * @param observer 观察者
	 */
	public void attach(Observer observer){
		this.Observers.add(observer);
	}
	
	/**
	 * 移除观察者
	 * @param observer 观察者
	 */
	public void detach(Observer observer){
		this.Observers.remove(observer);
	}
	
	/**
	 * 发布通知
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
