package com.jiangqi.gof23.publish;

/**
 * 抽象的观察者
 * @author jiangqi
 *
 */
public interface  Observer {

	/**
	 * 主题状态变化回调方法
	 */
	public  void update();
}
