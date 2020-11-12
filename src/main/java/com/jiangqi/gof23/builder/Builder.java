package com.jiangqi.gof23.builder;

/**
 * 构建者接口
 * @author jiangqi
 *
 */
public interface Builder {

	/**
	 * 创建部件A　　比如创建汽车车轮
	 */
	void buildPartA();
	
	/**
	 * 创建部件B		比如创建汽车方向盘
	 */
	void buildPartB();
		
	/**
	 * 返回这个产品
	 * @return 构建出的产品
	 */
	Product getResult(); 
}
