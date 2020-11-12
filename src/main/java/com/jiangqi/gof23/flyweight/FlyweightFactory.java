package com.jiangqi.gof23.flyweight;

import java.util.HashMap;

/**
 * 享元工厂<br>
 * 用来管理Flyweight对象，它主要用来确保合理的共享Flyweight，当用户请求Flyweight时, 工厂根据情况创建或提供一个已经实例化的对象
 */
public class FlyweightFactory {
	private HashMap<String, ConcreteFlyweight> flyweights = new HashMap<String, ConcreteFlyweight>();

	public FlyweightFactory() {
	}

	/**
	 * 通过key获得对应的IFlyweight
	 * 
	 * @param key
	 * @return IFlyweight
	 */
	public IFlyweight getFlyWeight(String key) {
		IFlyweight flyweight = (IFlyweight) flyweights.get(key);
		if (flyweight == null) {
			// 产生新的ConcreteFlyweight
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
