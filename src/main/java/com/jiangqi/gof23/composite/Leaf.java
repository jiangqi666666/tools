package com.jiangqi.gof23.composite;

/**
 * 页节点类
 * @author jiangqi
 * @see Component
 */
public class Leaf extends Component {
	
	public Leaf(String name){
		super(name);
	}

	@Override
	public void add(Component c) {

		System.out.println("不能添加到leaf");
	}

	@Override
	public void remove(Component c) {

		System.out.println("不能移除从leaf");
	}

	@Override
	public void display(int depth) {

		for(int i=1;i<=depth;i++){
			System.out.print("-");
		}
		System.out.println(this.name);
	}
}
