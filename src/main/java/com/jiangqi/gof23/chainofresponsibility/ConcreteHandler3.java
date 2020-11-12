package com.jiangqi.gof23.chainofresponsibility;

/**
 * ������ʵ����3
 * @author jiangqi
 *@see Handler
 */
public class ConcreteHandler3 extends Handler {

	@Override
	public void HandleRequest(int request) {
		// TODO Auto-generated method stub
		if(request>=20 && request<30)
			System.out.println(this.getClass().getName()+"��������"+request);
		else if(successor!=null)
			successor.HandleRequest(request);
	}
}