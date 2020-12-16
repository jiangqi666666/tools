package com.jiangqi.gof23.decorator;

/**
 * 装饰者抽象类<br>
 * 完成被装饰方法的调用（通过他保障原有功能的实现）
 * @author jiangqi
 * @see IComponent
 */
public abstract class Decorator  implements IComponent {

	protected IComponent component;
	
	/**
	 * 设置被装饰类
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
