package com.jiangqi.gof23.prototype;

/**
 * 深克隆测试对象2
 * @author jiangqi
 *@see Cloneable
 */
public class AllTwoTest implements Cloneable {

	public String i="这是深复制对象Two默认值";;
	public AllOneTest one;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		AllTwoTest obj=(AllTwoTest) super.clone();
		obj.one=(AllOneTest)one.clone();
		
		return obj;
	}

}