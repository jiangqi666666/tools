package com.jiangqi.gof23.memenot;
/**
 * �����洢����״̬����
 */
public class Storage {
	private Memento<String> memento;

	/**
	 * ��ȡ״̬����
	 * @return
	 */
	public Memento<String> getMemento() {
		return memento;
	}

	/**
	 * ����״̬����
	 * @return
	 */
	public void setMemento(Memento<String> memento) {
		this.memento = memento;
	}
	
}
