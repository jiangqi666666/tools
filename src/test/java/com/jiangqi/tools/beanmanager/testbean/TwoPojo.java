package com.jiangqi.tools.beanmanager.testbean;

import java.util.ArrayList;
import java.util.List;

public class TwoPojo {
	private int a1;
	private int a2;
	private OnePojo a3;
	private List<OnePojo> a4=new ArrayList<OnePojo>();
	public int getA1() {
		return a1;
	}
	public void setA1(int a1) {
		this.a1 = a1;
	}
	public int getA2() {
		return a2;
	}
	public void setA2(int a2) {
		this.a2 = a2;
	}
	public OnePojo getA3() {
		return a3;
	}
	public void setA3(OnePojo a3) {
		this.a3 = a3;
	}
	public List<OnePojo> getA4() {
		return a4;
	}
	public void setA4(List<OnePojo> a4) {
		this.a4 = a4;
	}

	
}
