package com.jiangqi.gof23.prototype;

/**
 * ���¡���Զ���2
 * @author jiangqi
 *@see Cloneable
 */
public class AllTwoTest implements Cloneable {

	public String i="������ƶ���TwoĬ��ֵ";;
	public AllOneTest one;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		AllTwoTest obj=(AllTwoTest) super.clone();
		obj.one=(AllOneTest)one.clone();
		
		return obj;
	}

}