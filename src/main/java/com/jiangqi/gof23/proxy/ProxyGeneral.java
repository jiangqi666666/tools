package com.jiangqi.gof23.proxy;

/**
 * ��ͨ����ʽ
 * @author jiangqi
 *
 */
public class ProxyGeneral implements Subject {
	
	private RealSubject realSubject;

	@Override
	public void request() {
		// TODO Auto-generated method stub
		if(this.realSubject==null)
			this.realSubject=new RealSubject();
		
		this.realSubject.request();
	}

}
