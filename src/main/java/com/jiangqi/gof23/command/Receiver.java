package com.jiangqi.gof23.command;

/**
 * 命令执行者接口
 * @author jiangqi
 *
 * @param <T> 命令所需参数类型
 */
public interface Receiver<T> {
	/**
	 * 命令执行的方法
	 * @param info  命令参数
	 */
	public  void action(T info);
}
