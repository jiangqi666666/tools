package com.jiangqi.tools.propertymanager;

public class EventConsumer implements ValueChangeListener {  
	  
    @Override  
    public void performed(ValueChangeEvent e) {  
        System.out.println("value changed, new value = " + e.getValue());  
    }  
}  
