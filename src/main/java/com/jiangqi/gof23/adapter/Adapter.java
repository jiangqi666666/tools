package com.jiangqi.gof23.adapter;

/**
 * ��������
 * @author jiangqi
 *@see Target 
 *@see OtherTarget
 */
public class Adapter extends Target {
	private OtherTarget adaptee=new OtherTarget();

	@Override
	public void Request() {
		// TODO Auto-generated method stub
		System.out.println("��������װ��Request�ķ���");
		this.adaptee.SpecificRequest();
	}
	
}
