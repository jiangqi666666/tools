package com.jiangqi.gof23.visitor;
/**
 * 抽象的元素角色
 * 定义一个Accept操作，它以一个访问者为参数
 * */
public interface Element {
	
	/**
	 * 接受方法
	 * @param visitor 访问Element的访问者
	 */
	public void accept(Visitor visitor);
}
