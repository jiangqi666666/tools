package com.jiangqi.gof23.command;

/**
 * ����ӿ�
 * @author jiangqi
 *
 */
public  interface  Command {
	
	/**
	 * ִ������
	 */
	public  void execute();
	
	/**
	 * ȡ������
	 */
	public void undo();
	
	/**
	 * ��������
	 */
	public void redo();
	
}
