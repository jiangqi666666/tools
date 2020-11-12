package com.jiangqi.gof23.state;


/**
 * ״̬��
 * @author jiangqi
 */
public class StateMachine {
	private final String key="%d.%s";
	
	/**
	 * ����״̬������¼�
	 * @param event ����״̬�仯���¼�
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
