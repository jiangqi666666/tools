package com.jiangqi.gof23.event;

import java.util.ArrayList;

/**
 * ��ʾ���¼�Դ
 * @author jiangqi
 *
 */
public class DemoSource {
	private ArrayList<DemoListener> repository = new ArrayList<DemoListener>();// �����Լ��ļ���������

	/**
	 * ����¼�����
	 * @param dl
	 */
	public void addDemoListener(DemoListener dl) {
		repository.add(dl);
	}

	/**
	 * �����¼�
	 */
	public void notifyDemoEvent() {
		// ֪ͨ���еļ�����
		for(DemoListener obj : this.repository)
			obj.handleEvent(new DemoEvent(this));
	}
}
