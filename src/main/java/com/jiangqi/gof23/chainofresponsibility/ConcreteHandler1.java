package com.jiangqi.gof23.chainofresponsibility;

/**
 * 处理类实现者1
 * @author jiangqi
 *@see Handler
 */
public class ConcreteHandler1 extends Handler {

	@Override
	public void HandleRequest(int request) {
		// TODO Auto-generated method stub
		if(request>=0 && request<10)
			System.out.println(this.getClass().getName()+"处理请求："+request);
		else if(successor!=null)
			successor.HandleRequest(request);
	}
}
