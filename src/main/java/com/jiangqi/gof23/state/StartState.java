package com.jiangqi.gof23.state;

/**
 * һ��״̬���е�����״̬
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
		String str="״ֵ̬={%d},����exitAction";
		System.out.println(String.format(str, super.getState()));
	}

}
