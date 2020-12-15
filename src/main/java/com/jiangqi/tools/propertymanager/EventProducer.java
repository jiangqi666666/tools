package com.jiangqi.tools.propertymanager;

public class EventProducer {
	ListenerRegister register = new ListenerRegister();
	private Integer value=0;

	public Integer getValue() {
		return this.value;
	}

	public void setValue(Integer newValue) {
		if (this.value.intValue() != newValue.intValue()) {
			this.value=newValue;
			ValueChangeEvent event = new ValueChangeEvent(this, value);
			fireAEvent(event);
		}
	}

	public void addListener(ValueChangeListener a) {
		register.addListener(a);
	}

	public void removeListener(ValueChangeListener a) {
		register.removeListener(a);
	}

	public void fireAEvent(ValueChangeEvent event) {
		register.fireAEvent(event);
	}

}