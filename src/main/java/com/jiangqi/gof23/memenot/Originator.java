package com.jiangqi.gof23.memenot;

/**
 * ��������
 */
public class Originator {
	private String state;// ��Ҫ��������ԣ������ж��

	/**
	 * ��������¼������ǰ��Ҫ�������Ϣ���벢ʵ����һ��Memento����
	 */
	public Memento<String> createMemento() {
		return (new Memento<String>(this.state));
	}

	/**
	 * �ָ�����¼����Memento�����벢��������ݻָ�
	 */
	public void setMemento(Memento<String> memento) {
		this.state = memento.getState();
	}

	/**
	 * ��ʾ����
	 */
	public void show() {
		System.out.println("State=" + this.state);
	}

	/**
	 * ��ȡ״̬
	 * @return
	 */
	public String getState() {
		return state;
	}

	/**
	 * ����״̬
	 * @param state
	 */
	public void setState(String state) {
		this.state = state;
	}
}
