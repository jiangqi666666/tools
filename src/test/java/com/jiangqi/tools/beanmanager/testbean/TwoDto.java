package com.jiangqi.tools.beanmanager.testbean;

import java.util.ArrayList;
import java.util.List;

import com.jiangqi.tools.dto.TemplateDto;

public class TwoDto extends TemplateDto {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6830261234724262524L;
	private int a1;
	private OneDto a3;
	private List<OneDto> a4=new ArrayList<OneDto>();

	public TwoDto(){
		super.setSubClass(this);
	}

	public int getA1() {
		return a1;
	}

	public void setA1(int a1) {
		super.saveChange("a1", a1);
		this.a1 = a1;
	}

	public OneDto getA3() {
		return a3;
	}

	public void setA3(OneDto a3) {
		super.saveChange("a3", a3);
		this.a3 = a3;
	}

	public List<OneDto> getA4() {
		return a4;
	}

	public void setA4(List<OneDto> a4) {
		super.saveChange("a4", a4);
		this.a4 = a4;
	}
	
	
}
