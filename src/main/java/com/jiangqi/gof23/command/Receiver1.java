package com.jiangqi.gof23.command;

/**
 * ����������ִ����1<br>
 * ���������ĳ��ҵ��
 * @author jiangqi
 *
 */
public class Receiver1 implements Receiver<CommandInfo>{

	@Override
	public void action(CommandInfo info) {
		// TODO Auto-generated method stub
		System.out.println("ִ��ҵ������ �������par1="+info.getPar1());
	}
}
