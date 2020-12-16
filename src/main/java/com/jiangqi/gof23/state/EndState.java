package com.jiangqi.gof23.state;

public class EndState extends State {

	protected EndState() {
		super(-1);

	}

	@Override
	public void entryAction(Context context) {
		
		System.out.print("entryAction");

	}

	@Override
	public void doAction(Context context) {

		String str="×´Ì¬Öµ={%d},´¥·¢doAction";
		System.out.println(String.format(str, super.getState()));
	}

	@Override
	public void exitAction(Context context) {
		System.out.print("exitAction");
	}

}
