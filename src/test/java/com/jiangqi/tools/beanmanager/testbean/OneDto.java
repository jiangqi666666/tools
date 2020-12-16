package com.jiangqi.tools.beanmanager.testbean;

import com.jiangqi.tools.dto.TemplateDto;

public class OneDto extends TemplateDto {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3982842371948741016L;
	private int a1;
	private int a3;
	
	public OneDto(){
		super.setSubClass(this);
	}
	
	public int getA1() {
		return a1;
	}
	public void setA1(int a1) {
		super.saveChange("a1", a1);
		this.a1 = a1;
	}
	public int getA3() {
		return a3;
	}
	public void setA3(int a3) {
		super.saveChange("a3", a3);
		this.a3 = a3;
	} 
	
	
}
