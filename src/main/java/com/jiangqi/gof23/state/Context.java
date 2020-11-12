package com.jiangqi.gof23.state;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
/**
 * 状态机上下文环境
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
	 * 初始化状态策略
	 * @return
	 */
	private  void init(){
		State[] tmp={new StartState(),new ConcreteStateA(1),new ConcreteStateB(2),new EndState()};
		this.state=(tmp[0]);
		
		//从起始状态通过start事件触发，变化到ConcreteStateA状态
		this.strategy.put(String.format(key,tmp[0].getState(), "start"),tmp[1]);
		
		//从ConcreteStateA状态通过a1事件触发，变化到ConcreteStateB状态
		this.strategy.put(String.format(key,tmp[1].getState(), "a1"),tmp[2]);
		
		//从ConcreteStateA状态通过a2事件触发，变化到end状态
		this.strategy.put(String.format(key,tmp[1].getState(), "a2"),tmp[3]);
		
		//从ConcreteStateB状态通过b1事件触发，变化到ConcreteStateA状态
		this.strategy.put(String.format(key,tmp[2].getState(), "b1"),tmp[1]);
	}
}
