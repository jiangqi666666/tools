package com.jiangqi.gof23.visitor;
/**
 * �����Ԫ�ؽ�ɫ
 * ����һ��Accept����������һ��������Ϊ����
 * */
public interface Element {
	
	/**
	 * ���ܷ���
	 * @param visitor ����Element�ķ�����
	 */
	public void accept(Visitor visitor);
}
