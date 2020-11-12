package com.jiangqi.gof23.flyweight;

/**
 * 是继承Flyweight超类，并为内部状态增加存储空间
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
		System.out.println("具体Flyweight："+str);
	}

}
