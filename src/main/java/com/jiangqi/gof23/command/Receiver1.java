package com.jiangqi.gof23.command;

import java.io.Serializable;

/**
 * ����������ִ����1<br>
 * ���������ĳ��ҵ��
 * @author jiangqi
 *
 */
public class Receiver1 implements Receiver<CommandInfo>  ,Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5182882939002651889L;

	@Override
	public void action(CommandInfo info) {
		
		System.out.println("ִ��ҵ������ �������par1="+info.getPar1());
	}
}
