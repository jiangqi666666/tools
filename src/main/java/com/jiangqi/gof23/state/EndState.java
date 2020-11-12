package com.jiangqi.gof23.state;

public class EndState extends State {

	protected EndState() {
		super(-1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void entryAction(Context context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void doAction(Context context) {
		// TODO Auto-generated method stub
		String str="×´Ì¬Öµ={%d},´¥·¢doAction";
		System.out.println(String.format(str, super.getState()));
	}

	@Override
	public void exitAction(Context context) {
		// TODO Auto-generated method stub

	}

}
