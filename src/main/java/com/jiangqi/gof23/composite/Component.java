package com.jiangqi.gof23.composite;

/**
 * 节点类<p>
 * 是一个抽象类，为组合节点和页节点的父类
 * @author jiangqi
 *
 */
public abstract class Component {
	protected String name;
	public Component(String name){
		this.name=name;
	}
	/**
	 * 添加节点（树叶或树枝）
	 */
	public abstract void add(Component c);
	
	/**
	 * 移除节点（树叶或树枝）
	 */
	public abstract void remove(Component c);
	
	/**
	 * 显示内容
	 * @param depth 需要多少个横线
	 */
	public abstract void display(int depth);
}
