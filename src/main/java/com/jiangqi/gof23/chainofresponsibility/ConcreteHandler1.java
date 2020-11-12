package com.jiangqi.gof23.chainofresponsibility;

/**
 * ������ʵ����1
 * @author jiangqi
 *@see Handler
 */
public class ConcreteHandler1 extends Handler {

	@Override
	public void HandleRequest(int request) {
		// TODO Auto-generated method stub
		if(request>=0 && request<10)
			System.out.println(this.getClass().getName()+"��������"+request);
		else if(successor!=null)
			successor.HandleRequest(request);
	}
}
