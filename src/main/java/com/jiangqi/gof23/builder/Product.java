package com.jiangqi.gof23.builder;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * �������Ĳ�Ʒ
 * @author jiangqi
 *
 */
public class Product {
	private ArrayList<String> parts=new ArrayList<>();
	
	/**
	 * ��ʾ������������Ʒ��һ����
	 */
	public void add(String parts){
		this.parts.add(parts);
	}
	
	/**
	 * ��ʾ������չ�ֳ������Ĳ�Ʒ����
	 */
	public void show(){
		System.out.println("\n ��Ʒ ����---");
		Iterator<String> ite=this.parts.iterator();
		String obj;
		while(ite.hasNext()){
			obj=ite.next();
			System.out.println(obj+",");
		}
	}
}
