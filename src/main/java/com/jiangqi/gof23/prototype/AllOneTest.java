package com.jiangqi.gof23.prototype;

/**
 * 深克隆测试对象1
 * @author jiangqi
 *@see Cloneable
 */
public class AllOneTest implements Cloneable {

	public String i="这是深复制对象One默认值";
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
