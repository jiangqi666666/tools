package com.jiangqi.gof23.singleton;

/**
 * 单例
 * 
 * @author jiangqi
 *
 */
public class Singleton {

	private static Singleton instance;

	// 将构造方法设置为私有，堵死外界利用new创建此类实例的可能
	private Singleton() {}

	/**
	 * 获得单例
	 * 
	 * @return
	 */
	public static Singleton GetInstance() {
		if (Singleton.instance == null) {
			synchronized (Singleton.instance) {
				if (Singleton.instance == null)
					Singleton.instance = new Singleton();
			}
		}
		return Singleton.instance;
	}

}
