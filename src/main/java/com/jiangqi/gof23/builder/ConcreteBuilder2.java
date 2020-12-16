package com.jiangqi.gof23.builder;

/**
 * 一个构建者实例
 * @author jiangqi
 *@see Builder
 */
public class ConcreteBuilder2 implements Builder {
	private Product product=new Product();

	@Override
	public void buildPartA() {
		// 这里是具体如何构建partA的代码
		this.product.add("创建大客车车轮");
	}

	@Override
	public void buildPartB() {
		// 这里是具体如何构建partB的代码
		this.product.add("创建大客车方向盘");
	}

	@Override
	public Product getResult() {
		// 返回最后组装成品结果
		return this.product;
	}
}
