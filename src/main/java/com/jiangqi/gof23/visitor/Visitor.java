package com.jiangqi.gof23.visitor;
/**
 * ����ķ�����<br>
 *  Ϊ�ö���ṹ�о���Ԫ�ؽ�ɫ����һ�����ʲ����ӿ�.<br>
 * Ϊ�ö���ṹ��ConcreteElement��ÿһ��������һ��visit����
 * */
public interface  Visitor {
	
	/**
	 * ����ConcreteElementA�Ĳ���
	 * @param concreteElementA
	 */
	public  void visitConcreteElementA(ConcreteElementA concreteElementA);
	
	/**
	 * ����ConcreteElementB�Ĳ���
	 * @param concreteElementB
	 */
	public  void visitConcreteElementB(ConcreteElementB concreteElementB);
}
