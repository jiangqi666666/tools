package com.jiangqi.gof23.prototype;

import lombok.Getter;
import lombok.Setter;

/**
 * ���¡���Զ���2
 * @author jiangqi
 *@see Cloneable
 */
@Setter
@Getter
public class AllTwoTest implements Cloneable {

	private String i="������ƶ���TwoĬ��ֵ";
	private AllOneTest one;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {

		AllTwoTest obj=(AllTwoTest) super.clone();
		obj.one=(AllOneTest)one.clone();
		
		return obj;
	}

}