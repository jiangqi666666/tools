package com.jiangqi.gof23.builder;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * �������Ĳ�Ʒ
 * @author jiangqi
 *
 */
public class Product {
	private ArrayList<String> parts=new ArrayList<String>();
	
	/**
	 * ��ʾ������������Ʒ��һ����
	 */
	public void Add(String parts){
		this.parts.add(parts);
	}
	
	/**
	 * ��ʾ������չ�ֳ������Ĳ�Ʒ����
	 */
	public void Show(){
		System.out.println("\n ��Ʒ ����---");
		Iterator<String> ite=this.parts.iterator();
		String obj;
		while(ite.hasNext()){
			obj=(String)ite.next();
			System.out.println(obj+",");
		}
	}
}
