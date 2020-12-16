package com.jiangqi.gof23.flyweight;

import java.util.HashMap;

/**
 * ��Ԫ����<br>
 * ��������Flyweight��������Ҫ����ȷ������Ĺ���Flyweight�����û�����Flyweightʱ, ������������������ṩһ���Ѿ�ʵ�����Ķ���
 */
public class FlyweightFactory {
	private HashMap<String, ConcreteFlyweight> flyweights = new HashMap<>();


	/**
	 * ͨ��key��ö�Ӧ��IFlyweight
	 * 
	 * @param key
	 * @return IFlyweight
	 */
	public IFlyweight getFlyWeight(String key) {
		
		/* java8֮ǰ����map�и���key��ȡvalue�������ܻ�������Ĳ���
		Object key = map.get("key");
		if (key == null) {
		    key = new Object();
		    map.put("key", key);
		}

		java8֮������Ĳ������Լ�Ϊһ�У���key��Ӧ��valueΪ�գ��Ὣ�ڶ��������ķ���ֵ���벢����
		Object key2 = map.computeIfAbsent("key", k -> new Object());
		*/
		
		return flyweights.computeIfAbsent(key, k -> new ConcreteFlyweight(key));
	}

	public int getFlyweightSize() {
		return this.flyweights.size();
	}
}
