package com.jiangqi.gof23.prototype;

import lombok.Getter;
import lombok.Setter;

/**
 * ���¡���Զ���1
 * @author jiangqi
 *@see Cloneable
 */
@Getter
@Setter
public class AllOneTest implements Cloneable {

	private  String i="������ƶ���OneĬ��ֵ";
	
	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}
	
}
