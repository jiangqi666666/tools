package com.jiangqi.tools.propertyManager;

public class EventConsumer implements ValueChangeListener {  
	  
    @Override  
    public void performed(ValueChangeEvent e) {  
        System.out.println("value changed, new value = " + e.getValue());  
    }  
}  
