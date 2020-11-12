package com.jiangqi.gof23.mediator;

/**
 * �н�ӿ�
 * @author jiangqi
 *
 */
public interface Mediator {
	
	/**
	 * ��������Ϣ����
	 * @param message ��Ϣ
	 * @param name ������Ϣ��ͬ����
	 */
	public void send(String message,String name);
	
	/**
	 * �����Ҫ�н��ͬ��
	 * @param colleague
	 */
	public Mediator addColleague(Colleague colleague);
}
