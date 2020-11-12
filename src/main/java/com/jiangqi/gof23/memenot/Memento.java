package com.jiangqi.gof23.memenot;

/**
 * ״̬�ı���
 * @author jiangqi
 *
 */
public class Memento<T> {
	private T state;

	public Memento(T state){
		this.state=state;
	}
	
	public T getState() {
		return state;
	}

	public void setState(T state) {
		this.state = state;
	}
	
}
