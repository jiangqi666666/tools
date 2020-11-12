package com.jiangqi.tools.dto;

import java.util.ArrayList;
import java.util.List;

/*
 * ��ʾDto����д����<br>
 * �ڹ��캯�������setSubClass(this);<br>
 * Ϊ�˼�¼����ԭ��ֵ���������Ե�set�����У���һ������ӣ�saveChange(��������,ԭ����ֵ);<br>
 * ������У��ģ�Ҫ��ӡ�public List<String> valid+����������ĸ��д()���ķ������ڷ�������дУ������
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
			ret.add("aa���Դ������ݷ�Χ�������10��С��100");
		return ret;
	}
	
	public List<String> validCc(){
		List<String> ret=new ArrayList<String>();
		if(this.cc==false)
			ret.add("cc���Դ���ccȡֵ����Ϊ��");
		return ret;
	}
}
