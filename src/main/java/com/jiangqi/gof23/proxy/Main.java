package com.jiangqi.gof23.proxy;

import java.lang.reflect.Proxy;

public class Main {

	/**
	 * proxy 代理模式 
	 * 1、远程代理，为一个对象在不同的地址空间提供局部代表，以隐藏一个对象存在于不同地址空间的事实；
	 * 2、虚拟代理，是根据需要创建开销很大的对象，通过它来存放实例化需要很长时间的真实对象； 
	 * 3、安全代理，用来控制真实对象访问时的权限；
	 * 4、智能指引，指调用真实对象时，代理处理另外一些事
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 普通代理演示
		System.out.println("普通代理演示");
		ProxyGeneral proxy = new ProxyGeneral();
		proxy.request();

		// 动态代理演示
		System.out.println("jdk动态代理演示");
		
		Subject real=new RealSubject();
		ProxyHandler handler=new ProxyHandler(real);
		Subject proxySubject = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(),
				real.getClass().getInterfaces(), handler);

		proxySubject.request();

	}

}
