package com.jiangqi.gof23.prototype;

import lombok.Getter;
import lombok.Setter;

/**
 * 浅克隆测试对象2
 * @author jiangqi
 * @see Cloneable
 */
@Getter
@Setter
public class TwoTest implements Cloneable {

	private String i="这是浅复制对象Two默认值";
	private OneTest one;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

}
