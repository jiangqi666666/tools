package com.jiangqi.gof23.flyweight;

import java.util.HashMap;

/**
 * 享元工厂<br>
 * 用来管理Flyweight对象，它主要用来确保合理的共享Flyweight，当用户请求Flyweight时, 工厂根据情况创建或提供一个已经实例化的对象
 */
public class FlyweightFactory {
	private HashMap<String, ConcreteFlyweight> flyweights = new HashMap<>();


	/**
	 * 通过key获得对应的IFlyweight
	 * 
	 * @param key
	 * @return IFlyweight
	 */
	public IFlyweight getFlyWeight(String key) {
		
		/* java8之前。从map中根据key获取value操作可能会有下面的操作
		Object key = map.get("key");
		if (key == null) {
		    key = new Object();
		    map.put("key", key);
		}

		java8之后。上面的操作可以简化为一行，若key对应的value为空，会将第二个参数的返回值存入并返回
		Object key2 = map.computeIfAbsent("key", k -> new Object());
		*/
		
		return flyweights.computeIfAbsent(key, k -> new ConcreteFlyweight(key));
	}

	public int getFlyweightSize() {
		return this.flyweights.size();
	}
}
