package com.jiangqi.tools.testBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TestTwo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5327333277122069487L;
	private int a;
	private int b;
	private List<TestOne> one=new ArrayList<TestOne>();
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public List<TestOne> getOne() {
		return one;
	}
	public void setOne(List<TestOne> one) {
		this.one = one;
	}
	
	
}
