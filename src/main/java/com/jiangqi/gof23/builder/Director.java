package com.jiangqi.gof23.builder;

/**
 * ��������<p>
 * �����ȶ��Ĺ������̴�����Ʒ�����ǲ����˽��������������ڲ�ϸ��
 * @author jiangqi
 *
 */
public class Director {
	
	private Builder builder;
	
	/**
	 * ������partA partB�����ɸ��Ӷ���ķ���<p>
	 * �����ǽ����� ��������װ�������Ĺ���
	 * @param builder ʹ�õľ��幹����
	 */
	public void construct(Builder builder){
		this.builder=builder;
		builder.buildPartA();
		builder.buildPartB();
	}
	
	/**
	 * ���ش������Ĳ�Ʒ
	 * @return �������Ĳ�Ʒ
	 */
	public Product getResult() {
		// ���������װ��Ʒ���
		return this.builder.getResult();
	} 
}
