package com.jiangqi.gof23.chainofresponsibility;

/**
 * 处理类
 * @author jiangqi
 *
 */
public abstract class Handler {
	protected Handler successor;

	/**
	 * 设置任务后续处理者
	 * @param successor 后续处理者
	 */
	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}
	
	/**
	 * 具体任务请求
	 * @param request 任务请求
	 */
	public abstract void handleRequest(int request);
}
