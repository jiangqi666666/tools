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
	public abstract void Add(Component c);
	
	/**
	 * �Ƴ��ڵ㣨��Ҷ����֦��
	 */
	public abstract void Remove(Component c);
	
	/**
	 * ��ʾ����
	 * @param depth ��Ҫ���ٸ�����
	 */
	public abstract void Display(int depth);
}
