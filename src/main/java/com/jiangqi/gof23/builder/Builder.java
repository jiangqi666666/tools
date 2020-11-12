package com.jiangqi.gof23.builder;

/**
 * �����߽ӿ�
 * @author jiangqi
 *
 */
public interface Builder {

	/**
	 * ��������A�������紴����������
	 */
	void buildPartA();
	
	/**
	 * ��������B		���紴������������
	 */
	void buildPartB();
		
	/**
	 * ���������Ʒ
	 * @return �������Ĳ�Ʒ
	 */
	Product getResult(); 
}
