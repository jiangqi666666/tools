package com.jiangqi.gof23.state;

import lombok.Getter;

/**
 * ״̬����ӿ�
 * @author jiangqi
 *@see StateMachine
 */
@Getter
public abstract class  State {
	
	/**
	 * ״̬ȡֵ
	 */
	private int state;
	
	protected State(int state){
		this.state=state;
	}
	
	/**
	 * ״̬���ǰ��Ҫ������
	 * @param context �����Ļ���
	 */
	protected abstract  void entryAction(Context context);
	
	/**
	 * ״̬���
	 * @param context �����Ļ���
	 */
	protected abstract  void doAction(Context context);
	
	/**
	 * �˳�״̬������
	 * @param context �����Ļ���
	 */
	protected abstract  void exitAction(Context context);
	
}
