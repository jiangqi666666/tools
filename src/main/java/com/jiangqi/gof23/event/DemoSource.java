package com.jiangqi.gof23.event;

import java.util.ArrayList;

/**
 * 演示用事件源
 * @author jiangqi
 *
 */
public class DemoSource {
	private ArrayList<DemoListener> repository = new ArrayList<DemoListener>();// 监听自己的监听器队列

	/**
	 * 添加事件侦听
	 * @param dl
	 */
	public void addDemoListener(DemoListener dl) {
		repository.add(dl);
	}

	/**
	 * 发布事件
	 */
	public void notifyDemoEvent() {
		// 通知所有的监听器
		for(DemoListener obj : this.repository)
			obj.handleEvent(new DemoEvent(this));
	}
}
