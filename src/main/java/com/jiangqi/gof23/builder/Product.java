package com.jiangqi.gof23.builder;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 构建出的产品
 * @author jiangqi
 *
 */
public class Product {
	private ArrayList<String> parts=new ArrayList<>();
	
	/**
	 * 演示方法，创建产品的一部分
	 */
	public void add(String parts){
		this.parts.add(parts);
	}
	
	/**
	 * 演示方法，展现出创建的产品内容
	 */
	public void show(){
		System.out.println("\n 产品 创建---");
		Iterator<String> ite=this.parts.iterator();
		String obj;
		while(ite.hasNext()){
			obj=ite.next();
			System.out.println(obj+",");
		}
	}
}
