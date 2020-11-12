package com.jiangqi.tools.dto;

import java.util.ArrayList;
import java.util.List;

/*
 * 演示Dto的书写方法<br>
 * 在构造函数中添加setSubClass(this);<br>
 * 为了记录属性原有值，所有属性的set方法中，第一句需添加：saveChange(属性名称,原属性值);<br>
 * 属性需校验的，要添加“public List<String> valid+属性名首字母大写()”的方法，在方法中填写校验内容
 * */
public class ExampleDto extends TemplateDto {

	private static final long serialVersionUID = 3823038213205522002L;
	
	private int aa;
	private String bb;
	private boolean cc;
	
	public ExampleDto(){
		super.setSubClass(this);
	}
	
	public int getAa() {
		return aa;
	}

	public void setAa(int aa) {
		super.saveChange("aa",this.aa);
		this.aa = aa;
	}

	public String getBb() {
		return bb;
	}

	public void setBb(String bb) {
		super.saveChange("bb",this.bb);
		this.bb = bb;
	}

	public boolean isCc() {
		return cc;
	}

	public void setCc(boolean cc) {
		super.saveChange("cc",this.cc);
		this.cc = cc;
	}

	public List<String> validAa(){
		List<String> ret=new ArrayList<String>();
		if(this.aa>100||this.aa<10)
			ret.add("aa属性错误，数据范围必须大于10，小于100");
		return ret;
	}
	
	public List<String> validCc(){
		List<String> ret=new ArrayList<String>();
		if(this.cc==false)
			ret.add("cc属性错误，cc取值必须为真");
		return ret;
	}
}
