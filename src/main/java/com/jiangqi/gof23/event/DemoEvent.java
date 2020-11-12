package com.jiangqi.gof23.event;

import java.util.EventObject;

/**
 *  ��ʾ���¼���<br>
 *  �̳�java.util.EventObject
 * @author jiangqi
 * @see EventObject
 */
public class DemoEvent extends EventObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * �¼������캯��<br>
	 * ���� Event �ڹ���ʱ�������˶��� "source"�����߼�����Ϊ�ö�������������й� Event �Ķ���
	 * @param source �¼�Դ�������ڽ����Ϸ����ĵ����ť�¼��еİ�ť
	 */
	public DemoEvent(Object source) {
		super(source);
	}

	/**
	 * �¼��ص�����
	 */
	public void say() {
		System.out.println("This is say method...");
	}
}
