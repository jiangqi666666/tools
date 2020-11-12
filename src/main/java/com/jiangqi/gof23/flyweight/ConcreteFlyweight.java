package com.jiangqi.gof23.flyweight;

/**
 * �Ǽ̳�Flyweight���࣬��Ϊ�ڲ�״̬���Ӵ洢�ռ�
 * @author jiangqi
 *
 */
public class ConcreteFlyweight implements IFlyweight {
	
	private String str;
	
	public ConcreteFlyweight(String str){
		this.str=str;
	}

	@Override
	public void Operation() {
		// TODO Auto-generated method stub
		System.out.println("����Flyweight��"+str);
	}

}
