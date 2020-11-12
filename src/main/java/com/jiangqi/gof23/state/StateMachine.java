package com.jiangqi.gof23.state;


/**
 * 状态机
 * @author jiangqi
 */
public class StateMachine {
	private final String key="%d.%s";
	
	/**
	 * 触发状态变更的事件
	 * @param event 触发状态变化的事件
	 */
	public void changeState(Context context,String event){
		
		State tmp=context.getStrategy().get(String.format(key, context.getState().getState(),event));
		
		if(tmp==null)
			return;
		
		if(tmp.getState()==-1&&context.getState().getState()==-1)
			return;
		
		context.getState().exitAction(context);
		context.setState(tmp);
		context.getState().entryAction(context);
		context.getState().doAction(context);
	}
}
