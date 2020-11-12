package com.jiangqi.gof23.event;

import java.util.EventListener;

/**
 * 演示用事件侦听器接口<br>
 * 继承：java.util.EventListener接口
 * @author jiangqi
 * @see EventListener
 */
public interface DemoListener extends EventListener {     
       
	/**
	 * 事件处理方法<br>
	 * EventListener是所有事件侦听器接口必须扩展的标记接口、因为它是无内容的标记接口<br>
	 * 所以事件处理方法由我们自己声明如下
	 * @param dm 演示用事件类
	 */
    public void handleEvent(DemoEvent dm);     
} 