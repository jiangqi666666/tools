package com.jiangqi.gof23.event;

/**
 * ��ʾ���¼�������1
 * @author jiangqi
 * @see DemoListener
 */
public class DemoListener1 implements DemoListener {     
	
	@Override
    public void handleEvent(DemoEvent de) {     
           System.out.println("Inside listener1...");     
           de.say();//�ص�     
    }     
}  