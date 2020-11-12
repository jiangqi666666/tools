package com.jiangqi.gof23.builder;

/**
 * һ��������ʵ��
 * @author jiangqi
 *@see Builder
 */
public class ConcreteBuilder1 implements Builder {

	private Product product=new Product();

	@Override
	public void buildPartA() {
		// �����Ǿ�����ι���partA�Ĵ���
		this.product.Add("������������");
	}

	@Override
	public void buildPartB() {
		// �����Ǿ�����ι���partB�Ĵ���
		this.product.Add("��������������");
	}

	@Override
	public Product getResult() {
		// ���������װ��Ʒ���
		return this.product;
	}
}