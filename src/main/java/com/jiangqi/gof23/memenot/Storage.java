package com.jiangqi.gof23.memenot;
/**
 * 用来存储备份状态的类
 */
public class Storage {
	private Memento<String> memento;

	/**
	 * 获取状态备份
	 * @return
	 */
	public Memento<String> getMemento() {
		return memento;
	}

	/**
	 * 设置状态备份
	 * @return
	 */
	public void setMemento(Memento<String> memento) {
		this.memento = memento;
	}
	
}
