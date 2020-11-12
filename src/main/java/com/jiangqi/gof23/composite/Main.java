package com.jiangqi.gof23.composite;

public class Main {
	/**
	 * ���ģʽ��Composite
	 * ��������ϳ����νṹ�Ա�ʾ������-���塱�Ĳ�νṹ�����ģʽʹ���û��Ե����������϶����ʹ�þ���һ���ԡ�
	 */
	public static void main(String[] args) {
		Composite root=new Composite("root");
		root.Add(new Leaf("Leaf A"));
		root.Add(new Leaf("Leaf B"));
		
		Composite comp=new Composite("Composite X");
		comp.Add(new Leaf("Leaf XA"));
		comp.Add(new Leaf("Leaf XB"));
		root.Add(comp);
		
		Composite comp2=new Composite("Composite XY");
		comp2.Add(new Leaf("Leaf XYA"));
		comp2.Add(new Leaf("Leaf XYB"));
		comp.Add(comp2);
		root.Add(new Leaf("Leaf C"));
		
		Leaf leaf=new Leaf("Leaf D");
		root.Add(leaf);
		root.Remove(leaf);
		root.Display(0);
	}
}
