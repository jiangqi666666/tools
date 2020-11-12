package com.jiangqi.gof23.singleton;

/**
 * ����
 * 
 * @author jiangqi
 *
 */
public class Singleton {

	private static Singleton instance;

	// �����췽������Ϊ˽�У������������new��������ʵ���Ŀ���
	private Singleton() {}

	/**
	 * ��õ���
	 * 
	 * @return
	 */
	public static Singleton GetInstance() {
		if (Singleton.instance == null) {
			synchronized (Singleton.instance) {
				if (Singleton.instance == null)
					Singleton.instance = new Singleton();
			}
		}
		return Singleton.instance;
	}

}
