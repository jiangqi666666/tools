package com.jiangqi.gof23.composite;

/**
 * �ڵ���<p>
 * ��һ�������࣬Ϊ��Ͻڵ��ҳ�ڵ�ĸ���
 * @author jiangqi
 *
 */
public abstract class Component {
	protected String name;
	public Component(String name){
		this.name=name;
	}
	/**
	 * ��ӽڵ㣨��Ҷ����֦��
	 */
	public abstract void add(Component c);
	
	/**
	 * �Ƴ��ڵ㣨��Ҷ����֦��
	 */
	public abstract void remove(Component c);
	
	/**
	 * ��ʾ����
	 * @param depth ��Ҫ���ٸ�����
	 */
	public abstract void display(int depth);
}
