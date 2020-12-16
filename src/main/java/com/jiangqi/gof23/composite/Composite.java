package com.jiangqi.gof23.composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 组合节点类
 * @author jiangqi
 *@see Component
 */
public class Composite extends Component {
	private ArrayList<Component> children=new ArrayList<>();
	
	public Composite(String name){
		super(name);
	}

	@Override
	public void add(Component c) {
		
		this.children.add(c);
	}

	@Override
	public void remove(Component c) {
		
		this.children.remove(c);
	}

	@Override
	public void display(int depth) {
		
		for(int i=1;i<=depth;i++){
			System.out.print("-");
		}
		System.out.println(this.name);
		
		Iterator<Component> ite=this.children.iterator();
		Component obj;
		while(ite.hasNext()){
			obj=ite.next();
			obj.display(depth+2);
		}
	}

}
