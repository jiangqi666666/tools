package com.jiangqi.gof23.command;

/**
 * ����������ִ����2<br>
 * ��¼ҵ�������־
 * @author jiangqi
 *
 */
public class Receiver2 implements Receiver<CommandInfo>{

	@Override
	public void action(CommandInfo info) {
		// TODO Auto-generated method stub
		System.out.println("��¼������־�� �������par1="+info.getPar1());
	}
}
