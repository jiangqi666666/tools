package com.jiangqi.gof23.command;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * ���������ʵ����<br>
 * ���Ե���Զ�̵�Receiver,�������л�
 * @author jiangqi
 *@see Command
 */
public class ConcreteCommand<T>  implements Command,Serializable  {
	private static final long serialVersionUID = 1L;
	private List<Receiver<T>> receivers=new ArrayList<>();
	private T commandPars=null;

	/**
	 * �����๹�캯��
	 * @param info �������
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
	 * ��������ʵ�ʽ�����
	 * @param receiver
	 */
	public void addReceiver(Receiver<T> receiver) {
	
		this.receivers.add(receiver);
	}
}
