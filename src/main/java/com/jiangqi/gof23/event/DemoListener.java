package com.jiangqi.gof23.event;

import java.util.EventListener;

/**
 * ��ʾ���¼��������ӿ�<br>
 * �̳У�java.util.EventListener�ӿ�
 * @author jiangqi
 * @see EventListener
 */
public interface DemoListener extends EventListener {     
       
	/**
	 * �¼�������<br>
	 * EventListener�������¼��������ӿڱ�����չ�ı�ǽӿڡ���Ϊ���������ݵı�ǽӿ�<br>
	 * �����¼��������������Լ���������
	 * @param dm ��ʾ���¼���
	 */
    public void handleEvent(DemoEvent dm);     
} 