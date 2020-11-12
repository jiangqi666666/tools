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
	private List<Receiver<T>> receivers=new ArrayList<Receiver<T>>();
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
		// TODO Auto-generated method stub
		for(Receiver<T> receiver:this.receivers)
			receiver.action(this.commandPars);
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
	}

	@Override
	public void redo() {
		// TODO Auto-generated method stub
	}

	/**
	 * ��������ʵ�ʽ�����
	 * @param receiver
	 */
	public void addReceiver(Receiver<T> receiver) {
		// TODO Auto-generated method stub
		this.receivers.add(receiver);
	}
}
