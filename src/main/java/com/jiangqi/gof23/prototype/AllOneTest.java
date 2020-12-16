package com.jiangqi.gof23.prototype;

import lombok.Getter;
import lombok.Setter;

/**
 * 深克隆测试对象1
 * @author jiangqi
 *@see Cloneable
 */
@Getter
@Setter
public class AllOneTest implements Cloneable {

	private  String i="这是深复制对象One默认值";
	
	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}
	
}
