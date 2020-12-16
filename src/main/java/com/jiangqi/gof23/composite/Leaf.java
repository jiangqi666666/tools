package com.jiangqi.gof23.composite;

/**
 * ҳ�ڵ���
 * @author jiangqi
 * @see Component
 */
public class Leaf extends Component {
	
	public Leaf(String name){
		super(name);
	}

	@Override
	public void add(Component c) {

		System.out.println("������ӵ�leaf");
	}

	@Override
	public void remove(Component c) {

		System.out.println("�����Ƴ���leaf");
	}

	@Override
	public void display(int depth) {

		for(int i=1;i<=depth;i++){
			System.out.print("-");
		}
		System.out.println(this.name);
	}
}
