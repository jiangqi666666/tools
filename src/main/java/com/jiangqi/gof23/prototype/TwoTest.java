package com.jiangqi.gof23.prototype;

/**
 * ǳ��¡���Զ���2
 * @author jiangqi
 * @see Cloneable
 */
public class TwoTest implements Cloneable {

	public String i="����ǳ���ƶ���TwoĬ��ֵ";
	public OneTest one;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
