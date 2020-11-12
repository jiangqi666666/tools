package com.jiangqi.gof23.event;

import java.util.EventObject;

/**
 *  演示用事件类<br>
 *  继承java.util.EventObject
 * @author jiangqi
 * @see EventObject
 */
public class DemoEvent extends EventObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 事件对象构造函数<br>
	 * 所有 Event 在构造时都引用了对象 "source"，在逻辑上认为该对象是最初发生有关 Event 的对象
	 * @param source 事件源对象：如在界面上发生的点击按钮事件中的按钮
	 */
	public DemoEvent(Object source) {
		super(source);
	}

	/**
	 * 事件回调函数
	 */
	public void say() {
		System.out.println("This is say method...");
	}
}
