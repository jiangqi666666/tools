package com.jiangqi.gof23.composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 组合节点类
 * @author jiangqi
 *@see Component
 */
public class Composite extends Component {
	private ArrayList<Component> children=new ArrayList<Component>();
	
	public Composite(String name){
		super(name);
	}

	@Override
	public void Add(Component c) {
		// TODO Auto-generated method stub
		this.children.add(c);
	}

	@Override
	public void Remove(Component c) {
		// TODO Auto-generated method stub
		this.children.remove(c);
	}

	@Override
	public void Display(int depth) {
		// TODO Auto-generated method stub
		for(int i=1;i<=depth;i++){
			System.out.print("-");
		}
		System.out.println(this.name);
		
		Iterator<Component> ite=this.children.iterator();
		Component obj;
		while(ite.hasNext()){
			obj=ite.next();
			obj.Display(depth+2);
		}
	}

}
