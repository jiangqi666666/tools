package com.jiangqi.gof23.command;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 具体的命令实现类<br>
 * 可以调用远程的Receiver,可以序列化
 * @author jiangqi
 *@see Command
 */
public class ConcreteCommand<T>  implements Command,Serializable  {
	private static final long serialVersionUID = 1L;
	private List<Receiver<T>> receivers=new ArrayList<>();
	private T commandPars=null;

	/**
	 * 命令类构造函数
	 * @param info 命令参数
	 */
	public ConcreteCommand(T info){
		this.commandPars=info;
	}
	
	@Override
	public void execute() {
		
		for(Receiver<T> receiver:this.receivers)
			receiver.action(this.commandPars);
	}

	@Override
	public void undo() {
		System.out.print("undo something");
		
	}

	@Override
	public void redo() {
		System.out.print("redo something");
		
	}

	/**
	 * 添加命令的实际接收者
	 * @param receiver
	 */
	public void addReceiver(Receiver<T> receiver) {
	
		this.receivers.add(receiver);
	}
}
