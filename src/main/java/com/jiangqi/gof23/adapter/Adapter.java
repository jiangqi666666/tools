package com.jiangqi.gof23.adapter;

/**
 * 适配器类
 * @author jiangqi
 *@see Target 
 *@see OtherTarget
 */
public class Adapter extends Target {
	private OtherTarget adaptee=new OtherTarget();

	@Override
	public void Request() {
		// TODO Auto-generated method stub
		System.out.println("适配器包装了Request的方法");
		this.adaptee.SpecificRequest();
	}
	
}
