package com.jiangqi.gof23.builder;

/**
 * 建造者类<p>
 * 按照稳定的构建过程创建产品，但是不用了解各个构建步骤的内部细节
 * @author jiangqi
 *
 */
public class Director {
	
	private Builder builder;
	
	/**
	 * 将部件partA partB最后组成复杂对象的方法<p>
	 * 这里是将车轮 方向盘组装成汽车的过程
	 * @param builder 使用的具体构建者
	 */
	public void construct(Builder builder){
		this.builder=builder;
		builder.buildPartA();
		builder.buildPartB();
	}
	
	/**
	 * 返回创建出的产品
	 * @return 创建出的产品
	 */
	public Product getResult() {
		// 返回最后组装成品结果
		return this.builder.getResult();
	} 
}
