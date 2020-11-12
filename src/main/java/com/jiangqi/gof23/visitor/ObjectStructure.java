package com.jiangqi.gof23.visitor;

import java.util.ArrayList;
import java.util.Iterator;
/**
 * 对象结构角色<br>
 * 这是使用访问者模式必备的角色. 它要具备以下特征:<br>
 *  能枚举它的元素; <br>
 * 可以提供一个高层的接口以允许该访问者访问它的元素; <br>
 * 可以是一个复合(组合模式)或是一个集合, 如一个列表或一个无序集合
 * */
public class ObjectStructure {
	private ArrayList<Element> elements=new ArrayList<Element>();
	
	/**
	 * 添加一个元素element
	 * @param element
	 */
	public void attach(Element element){
		elements.add(element);
	}
	
	/**
	 * 移除一个元素element
	 * @param element
	 */
	public void detach(Element element){
		elements.remove(element);
	}
	
	/**
	 * 访问者枚举元素的方法
	 * @param visitor 访问者
	 */
	public void accpet(Visitor visitor){
		Element obj;
		Iterator<Element> ite=this.elements.iterator();
		while(ite.hasNext()){
			obj=ite.next();
			obj.accept(visitor);
		}
	}
}
