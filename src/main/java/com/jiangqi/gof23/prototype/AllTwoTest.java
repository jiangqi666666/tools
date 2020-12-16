package com.jiangqi.gof23.prototype;

import lombok.Getter;
import lombok.Setter;

/**
 * 深克隆测试对象2
 * @author jiangqi
 *@see Cloneable
 */
@Setter
@Getter
public class AllTwoTest implements Cloneable {

	private String i="这是深复制对象Two默认值";
	private AllOneTest one;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {

		AllTwoTest obj=(AllTwoTest) super.clone();
		obj.one=(AllOneTest)one.clone();
		
		return obj;
	}

}