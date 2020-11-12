package com.jiangqi.gof23.abstractFactory;

/**
 * 虚拟工厂类
 * @author jiangqi
 *
 */
public   class  AbstractFactory {
	
	/**
	 * 获得具体One工厂
	 * @return 统一工厂接口
	 */
	public static IFcatory getOneFactory(){
		return new OneFactory();
	}
	
	/**
	 * 获得具体Two工厂
	 * @return 统一工厂接口
	 */
	public static  IFcatory getTwoFactory(){
		return new TwoFactory();
	}
}
