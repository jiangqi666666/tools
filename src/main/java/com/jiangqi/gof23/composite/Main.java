package com.jiangqi.gof23.composite;

public class Main {
	/**
	 * 组合模式：Composite
	 * 将对象组合成树形结构以表示“部分-整体”的层次结构，组合模式使得用户对单个对象和组合对象的使用具有一致性。
	 */
	public static void main(String[] args) {
		Composite root=new Composite("root");
		root.add(new Leaf("Leaf A"));
		root.add(new Leaf("Leaf B"));
		
		Composite comp=new Composite("Composite X");
		comp.add(new Leaf("Leaf XA"));
		comp.add(new Leaf("Leaf XB"));
		root.add(comp);
		
		Composite comp2=new Composite("Composite XY");
		comp2.add(new Leaf("Leaf XYA"));
		comp2.add(new Leaf("Leaf XYB"));
		comp.add(comp2);
		root.add(new Leaf("Leaf C"));
		
		Leaf leaf=new Leaf("Leaf D");
		root.add(leaf);
		root.remove(leaf);
		root.display(0);
	}
}
