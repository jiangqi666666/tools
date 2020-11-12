package com.jiangqi.gof23.command;



/**
 * ���ó���������
 * @author jiangqi
 *
 */
public class Invoker {
	private Command command;
	
	/**
	 * �����������
	 * @param command
	 */
	public void setCommand(Command command){
		this.command=command;
	}
	
	/**
	 * ִ������
	 */
	public void executeCommand(){
		this.command.execute();
	}
}
