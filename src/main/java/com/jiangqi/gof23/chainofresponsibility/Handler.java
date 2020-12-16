package com.jiangqi.gof23.chainofresponsibility;

/**
 * ������
 * @author jiangqi
 *
 */
public abstract class Handler {
	protected Handler successor;

	/**
	 * �����������������
	 * @param successor ����������
	 */
	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}
	
	/**
	 * ������������
	 * @param request ��������
	 */
	public abstract void handleRequest(int request);
}
