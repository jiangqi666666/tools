package com.jiangqi.gof23.memenot;

/**
 * 发起人类
 */
public class Originator {
	private String state;// 需要保存的属性，可能有多个

	/**
	 * 创建备忘录，将当前需要保存的信息导入并实例化一个Memento对象
	 */
	public Memento<String> createMemento() {
		return (new Memento<String>(this.state));
	}

	/**
	 * 恢复备忘录，将Memento对象导入并将相关数据恢复
	 */
	public void setMemento(Memento<String> memento) {
		this.state = memento.getState();
	}

	/**
	 * 显示数据
	 */
	public void show() {
		System.out.println("State=" + this.state);
	}

	/**
	 * 获取状态
	 * @return
	 */
	public String getState() {
		return state;
	}

	/**
	 * 设置状态
	 * @param state
	 */
	public void setState(String state) {
		this.state = state;
	}
}
