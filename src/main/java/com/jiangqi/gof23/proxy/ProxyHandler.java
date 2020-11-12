package com.jiangqi.gof23.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * jdk��̬������ʾ
 * @author jiangqi
 * @see InvocationHandler
 */
public class ProxyHandler implements InvocationHandler {

	private Object proxied;

	public ProxyHandler(Object proxied) {
		this.proxied = proxied;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// ��ת������Ŀ�����֮ǰ������ִ��һЩ���ܴ���

		// ת������Ŀ�����ķ���
		return method.invoke(proxied, args);

		// ��ת������Ŀ�����֮�󣬿���ִ��һЩ���ܴ���
	}
}
