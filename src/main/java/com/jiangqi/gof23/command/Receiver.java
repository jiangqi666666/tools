package com.jiangqi.gof23.command;

/**
 * ����ִ���߽ӿ�
 * @author jiangqi
 *
 * @param <T> ���������������
 */
public interface Receiver<T> {
	/**
	 * ����ִ�еķ���
	 * @param info  �������
	 */
	public  void action(T info);
}
