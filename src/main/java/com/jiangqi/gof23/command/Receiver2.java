package com.jiangqi.gof23.command;

import java.io.Serializable;

/**
 * ����������ִ����2<br>
 * ��¼ҵ�������־
 * @author jiangqi
 *
 */
public class Receiver2 implements Receiver<CommandInfo>,  Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4638494986601899506L;

	@Override
	public void action(CommandInfo info) {
		
		System.out.println("��¼������־�� �������par1="+info.getPar1());
	}
}
