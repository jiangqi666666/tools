package com.jiangqi.gof23.state;

/**
 * 一个状态机中的启动状态
 * @author jiangqi
 *
 */
public class StartState extends State {

	protected StartState() {
		super(0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void entryAction(Context context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void doAction(Context context) {
		// TODO Auto-generated method stub
	}

	@Override
	public void exitAction(Context context) {
		// TODO Auto-generated method stub
		String str="状态值={%d},触发exitAction";
		System.out.println(String.format(str, super.getState()));
	}

}
