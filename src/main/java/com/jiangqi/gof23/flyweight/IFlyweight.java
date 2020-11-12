package com.jiangqi.gof23.flyweight;

/**
 * 它是所有具体享元类的超类或接口，通过这个接口，Flyweight可以接受并作用于外部状态
 * @author jiangqi
 *
 */
public interface IFlyweight {
	
	/**
	 * 具体操作
	 */
	public void Operation();
}
