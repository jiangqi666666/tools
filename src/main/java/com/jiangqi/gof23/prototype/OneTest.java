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
public class OneTest implements Cloneable {

	private String i="����ǳ���ƶ���OneĬ��ֵ";
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
}
