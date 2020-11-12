package com.jiangqi.gof23.state;

public class ConcreteStateA extends State {

	public ConcreteStateA(int state) {
		super(state);
	}

	@Override
	public void entryAction(Context context) {
		// TODO Auto-generated method stub
		String str="状态值={%d},触发entryAction";
		System.out.println(String.format(str, super.getState()));
	}

	@Override
	public void doAction(Context context) {
		// TODO Auto-generated method stub
		String str="状态值={%d},触发doAction";
		System.out.println(String.format(str, super.getState()));
	}

	@Override
	public void exitAction(Context context) {
		// TODO Auto-generated method stub
		String str="状态值={%d},触发exitAction";
		System.out.println(String.format(str, super.getState()));
	}
}
