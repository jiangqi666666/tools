package com.jiangqi.gof23.command;

/**
 * 命令接口
 * @author jiangqi
 *
 */
public  interface  Command {
	
	/**
	 * 执行命令
	 */
	public  void execute();
	
	/**
	 * 取消命令
	 */
	public void undo();
	
	/**
	 * 重做命令
	 */
	public void redo();
	
}
