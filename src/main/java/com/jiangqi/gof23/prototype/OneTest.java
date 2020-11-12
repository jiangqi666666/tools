package com.jiangqi.gof23.prototype;

/**
 * 浅克隆测试对象2
 * @author jiangqi
 * @see Cloneable
 */
public class OneTest implements Cloneable {

	public String i="这是浅复制对象One默认值";
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
