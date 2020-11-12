package com.jiangqi.gof23.command;



/**
 * 调用程序对象的类
 * @author jiangqi
 *
 */
public class Invoker {
	private Command command;
	
	/**
	 * 设置命令对象
	 * @param command
	 */
	public void setCommand(Command command){
		this.command=command;
	}
	
	/**
	 * 执行命令
	 */
	public void executeCommand(){
		this.command.execute();
	}
}
