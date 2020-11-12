package com.jiangqi.gof23.flyweight;

import java.util.HashMap;

/**
 * ��Ԫ����<br>
 * ��������Flyweight��������Ҫ����ȷ������Ĺ���Flyweight�����û�����Flyweightʱ, ������������������ṩһ���Ѿ�ʵ�����Ķ���
 */
public class FlyweightFactory {
	private HashMap<String, ConcreteFlyweight> flyweights = new HashMap<String, ConcreteFlyweight>();

	public FlyweightFactory() {
	}

	/**
	 * ͨ��key��ö�Ӧ��IFlyweight
	 * 
	 * @param key
	 * @return IFlyweight
	 */
	public IFlyweight getFlyWeight(String key) {
		IFlyweight flyweight = (IFlyweight) flyweights.get(key);
		if (flyweight == null) {
			// �����µ�ConcreteFlyweight
			ConcreteFlyweight node=new ConcreteFlyweight(key);
			this.flyweights.put(key, node);
			
			flyweight=node;
		}
		return flyweight;
	}

	public int getFlyweightSize() {
		return this.flyweights.size();
	}
}
