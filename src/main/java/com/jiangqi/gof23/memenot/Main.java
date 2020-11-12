package com.jiangqi.gof23.memenot;

public class Main {

	/**
	 * 备忘录模式：Memento
	 * 在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，
	 * 这样以后就可以将该对象恢复到原先保存的状态。
	 * 此模式比较适用于功能比较复杂，但需要维护或记录属性历史的类，或者需要保存的属性只是众多
	 * 属性中的一小部分，Originator可以根据保存的Memento信息还原到前一状态
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Originator o=new Originator();
		o.setState("On");//将初始状态设置为On
		o.show();
		
		Storage c=new Storage();
		c.setMemento(o.createMemento());
		
		o.setState("Off");//将初始状态设置为Off
		o.show();
		
		o.setMemento(c.getMemento());//恢复原始状态
		o.show();
	}

}
