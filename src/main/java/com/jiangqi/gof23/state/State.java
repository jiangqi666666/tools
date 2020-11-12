package com.jiangqi.gof23.state;

import lombok.Getter;

/**
 * 状态抽象接口
 * @author jiangqi
 *@see StateMachine
 */
@Getter
public abstract class  State {
	
	/**
	 * 状态取值
	 */
	private int state;
	
	protected State(int state){
		this.state=state;
	}
	
	/**
	 * 状态变更前需要做的事
	 * @param context 上下文环境
	 */
	protected abstract  void entryAction(Context context);
	
	/**
	 * 状态变更
	 * @param context 上下文环境
	 */
	protected abstract  void doAction(Context context);
	
	/**
	 * 退出状态做的事
	 * @param context 上下文环境
	 */
	protected abstract  void exitAction(Context context);
	
}
