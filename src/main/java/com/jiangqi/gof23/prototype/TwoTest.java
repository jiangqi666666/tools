package com.jiangqi.gof23.prototype;

import lombok.Getter;
import lombok.Setter;

/**
 * ǳ��¡���Զ���2
 * @author jiangqi
 * @see Cloneable
 */
@Getter
@Setter
public class TwoTest implements Cloneable {

	private String i="����ǳ���ƶ���TwoĬ��ֵ";
	private OneTest one;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

}
