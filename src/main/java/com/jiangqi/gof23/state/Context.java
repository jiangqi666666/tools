package com.jiangqi.gof23.state;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
/**
 * ״̬�������Ļ���
 * @author jiangqi
 *
 */

public class Context {
	@Getter
	@Setter
	private State state;
	
	@Getter
	private final Map<String,State> strategy=new HashMap<String,State>();
	
	private final String key="%d.%s";
	
	public Context(){
		init();
	}
	
	/**
	 * ��ʼ��״̬����
	 * @return
	 */
	private  void init(){
		State[] tmp={new StartState(),new ConcreteStateA(1),new ConcreteStateB(2),new EndState()};
		this.state=(tmp[0]);
		
		//����ʼ״̬ͨ��start�¼��������仯��ConcreteStateA״̬
		this.strategy.put(String.format(key,tmp[0].getState(), "start"),tmp[1]);
		
		//��ConcreteStateA״̬ͨ��a1�¼��������仯��ConcreteStateB״̬
		this.strategy.put(String.format(key,tmp[1].getState(), "a1"),tmp[2]);
		
		//��ConcreteStateA״̬ͨ��a2�¼��������仯��end״̬
		this.strategy.put(String.format(key,tmp[1].getState(), "a2"),tmp[3]);
		
		//��ConcreteStateB״̬ͨ��b1�¼��������仯��ConcreteStateA״̬
		this.strategy.put(String.format(key,tmp[2].getState(), "b1"),tmp[1]);
	}
}
