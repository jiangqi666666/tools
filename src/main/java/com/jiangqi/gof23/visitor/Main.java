package com.jiangqi.gof23.visitor;

public class Main {

	/**
	 * 访问者模式：Visitor
	 * 表示一个作用于某对象结构中的各元素的操作。它使你可以在不改变各元素的类的前提下定义作用于这些元素的新操作
	 * 
	 * 从定义可以看出结构对象是使用访问者模式的必备条件，而且这个结构对象必须存在遍历自身各个对象的方法，
	 * 类似于Java中的Collection。
	 * 访问者模式的目的是要把处理从数据结构中分离出来，如果系统有比较稳定的数据结构，又有易于变化的算法的话，
	 * 使用访问者模式是个不错的选择，因为访问者模式使的算法操作的增加变得容易。
	 * 相反，如果系统的数据结构不稳定，易于变化，则此系统就不适合使用访问者模式了。
	 * 
	 * http://www.cnblogs.com/draem0507/p/3795158.html
	 */
	public static void main(String[] args) {

		ObjectStructure o=new ObjectStructure();
		o.attach(new ConcreteElementA());
		o.attach(new ConcreteElementB());
		
		ConcreteVisitor1 v1=new ConcreteVisitor1();
		ConcreteVisitor2 v2=new ConcreteVisitor2();
		
		o.accpet(v1);
		o.accpet(v2);
	}

}
