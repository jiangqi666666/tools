package com.jiangqi.gof23.state;

public class ConcreteStateA extends State {

	public ConcreteStateA(int state) {
		super(state);
	}

	@Override
	public void entryAction(Context context) {

		String str="״ֵ̬={%d},����entryAction";
		System.out.println(String.format(str, super.getState()));
	}

	@Override
	public void doAction(Context context) {

		String str="״ֵ̬={%d},����doAction";
		System.out.println(String.format(str, super.getState()));
	}

	@Override
	public void exitAction(Context context) {

		String str="״ֵ̬={%d},����exitAction";
		System.out.println(String.format(str, super.getState()));
	}
}
