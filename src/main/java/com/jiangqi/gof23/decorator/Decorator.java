package com.jiangqi.gof23.decorator;

/**
 * װ���߳�����<br>
 * ��ɱ�װ�η����ĵ��ã�ͨ��������ԭ�й��ܵ�ʵ�֣�
 * @author jiangqi
 * @see IComponent
 */
public abstract class Decorator  implements IComponent {

	protected IComponent component;
	
	/**
	 * ���ñ�װ����
	 * @param component
	 */
	public void setComponent(IComponent component) {
		this.component = component;
	}

	@Override
	public void operation() {

		if(this.component!=null)
			this.component.operation();
	}

}
