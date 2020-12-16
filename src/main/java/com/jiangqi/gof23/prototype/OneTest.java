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
public class OneTest implements Cloneable {

	private String i="这是浅复制对象One默认值";
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
}
