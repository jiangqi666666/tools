package com.jiangqi.gof23.interpreter;

/**
 * ������ʽ������һ������Ľ��Ͳ���������ӿ�Ϊ�����﷨�������нڵ㹲��
 * 
 * @author jiangqi
 *
 */
public abstract class Expression {
	/**
	 * �Ի���Ϊ׼�����������͸������κ�һ�����ʽ
	 */
	public abstract boolean interpret(Context ctx);

	/**
	 * �����������ʽ�ڽṹ���Ƿ���ͬ
	 */
	public abstract boolean equals(Object obj);

	/**
	 * ���ر��ʽ��hash code
	 */
	public abstract int hashCode();

	/**
	 * �����ʽת�����ַ���
	 */
	public abstract String toString();
}
