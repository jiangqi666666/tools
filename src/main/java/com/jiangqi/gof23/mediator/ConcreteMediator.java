package com.jiangqi.gof23.mediator;

import java.util.HashMap;
import java.util.Map;

//具体中介类
public class ConcreteMediator implements Mediator {
	
	private Map<String,Colleague> colleague=new HashMap<>();
	
	@Override
	public Mediator addColleague(Colleague colleague) {
		this.colleague.put(colleague.name, colleague);
		return this;
	}

	@Override
	public void send(String message, String name) {

		Colleague tmp=this.colleague.get(name);
		if(tmp!=null)
			tmp.notify(message);
	}

}
