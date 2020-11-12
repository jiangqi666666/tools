package com.jiangqi.gof23.event;

public class Main {

	public static void main(String args[]) {
		try {
			//创建一个新的事件源
			DemoSource ds = new DemoSource();
			
			// 将监听器在事件源对象中登记：
			DemoListener1 listener1 = new DemoListener1();
			ds.addDemoListener(listener1);
			
			//将匿名监听器在事件源对象中登记：
			ds.addDemoListener(
				new DemoListener() {
					public void handleEvent(DemoEvent event) {
						System.out.println("Method come from 匿名类...");
					}
			});
			
			ds.notifyDemoEvent();// 触发事件、通知监听器
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
