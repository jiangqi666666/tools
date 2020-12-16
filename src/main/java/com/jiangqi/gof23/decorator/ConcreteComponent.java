package com.jiangqi.gof23.decorator;

/**
 * 具体命令执行组件实例
 * @author jiangqi
 * @see IComponent
 */
public class ConcreteComponent implements IComponent {

	@Override
	public void operation() {

		System.out.println("具体对象的操作");
	}

}
