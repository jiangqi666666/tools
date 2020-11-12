package com.jiangqi.gof23.event;

public class Main {

	public static void main(String args[]) {
		try {
			//����һ���µ��¼�Դ
			DemoSource ds = new DemoSource();
			
			// �����������¼�Դ�����еǼǣ�
			DemoListener1 listener1 = new DemoListener1();
			ds.addDemoListener(listener1);
			
			//���������������¼�Դ�����еǼǣ�
			ds.addDemoListener(
				new DemoListener() {
					public void handleEvent(DemoEvent event) {
						System.out.println("Method come from ������...");
					}
			});
			
			ds.notifyDemoEvent();// �����¼���֪ͨ������
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
