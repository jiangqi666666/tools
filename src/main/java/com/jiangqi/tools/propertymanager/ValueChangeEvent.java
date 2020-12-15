package com.jiangqi.tools.propertymanager;

import java.util.EventObject;

public class ValueChangeEvent extends EventObject {

	/** 
	 *  
	 */
	private static final long serialVersionUID = 767352958358520268L;
	private Object value;

/*	public ValueChangeEvent(Object source) {
		this(source, null);
	}*/

	public ValueChangeEvent(Object source, Object newValue) {
		super(source);
		this.value = newValue;
	}

	public Object getValue() {
		return value;
	}
}
