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
	public void Add(Component c) {
		// TODO Auto-generated method stub
		System.out.println("������ӵ�leaf");
	}

	@Override
	public void Remove(Component c) {
		// TODO Auto-generated method stub
		System.out.println("�����Ƴ���leaf");
	}

	@Override
	public void Display(int depth) {
		// TODO Auto-generated method stub
		for(int i=1;i<=depth;i++){
			System.out.print("-");
		}
		System.out.println(this.name);
	}
}
