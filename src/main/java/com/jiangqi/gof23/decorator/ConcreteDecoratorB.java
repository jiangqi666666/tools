package com.jiangqi.gof23.decorator;

/**
 * װ����B<br>
 * �̳�Decorator�࣬���ñ�װ�η���ǰ���Է�������װ��<br>
 * ����������Decorator�ı�װ�η�������ȷ�����ԭ�з����ĵ���
 * @author jiangqi
 * @see Decorator
 */
public class ConcreteDecoratorB extends Decorator {

	
	@Override
	public void Operation() {
		// TODO Auto-generated method stub
		super.Operation();
		AddedBehavior();
		System.out.println("����װ�ζ���B�Ĳ���");
	}
	
	/**
	 * װ����B��ӵ�װ�η���
	 */
	private void AddedBehavior(){
		System.out.println("װ��B��ӵĹ���");
	}
}