package com.jiangqi.gof23.command;

import java.io.Serializable;

/**
 * 真正的命令执行者2<br>
 * 记录业务操作日志
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
		
		System.out.println("记录操作日志！ 命令参数par1="+info.getPar1());
	}
}
