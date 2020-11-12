package com.jiangqi.tools.propertyManager;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventProducer producer = new EventProducer();  
        producer.addListener(new EventConsumer());  
        producer.setValue(new Integer(2));  
	}

}
