package com.jiangqi.gof23.command;

import java.io.Serializable;

/**
 * 真正的命令执行者1<br>
 * 比如具体做某种业务
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
		
		System.out.println("执行业务请求！ 命令参数par1="+info.getPar1());
	}
}
