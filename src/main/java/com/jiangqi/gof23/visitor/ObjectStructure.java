package com.jiangqi.gof23.visitor;

import java.util.ArrayList;
import java.util.Iterator;
/**
 * ����ṹ��ɫ<br>
 * ����ʹ�÷�����ģʽ�ر��Ľ�ɫ. ��Ҫ�߱���������:<br>
 *  ��ö������Ԫ��; <br>
 * �����ṩһ���߲�Ľӿ�������÷����߷�������Ԫ��; <br>
 * ������һ������(���ģʽ)����һ������, ��һ���б��һ�����򼯺�
 * */
public class ObjectStructure {
	private ArrayList<Element> elements=new ArrayList<Element>();
	
	/**
	 * ���һ��Ԫ��element
	 * @param element
	 */
	public void attach(Element element){
		elements.add(element);
	}
	
	/**
	 * �Ƴ�һ��Ԫ��element
	 * @param element
	 */
	public void detach(Element element){
		elements.remove(element);
	}
	
	/**
	 * ������ö��Ԫ�صķ���
	 * @param visitor ������
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
