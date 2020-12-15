package com.jiangqi.gof23.abstractfactory;

/**
 * 统一工厂接口
 * @author jiangqi
 *
 */
public interface IFcatory {
	
	/**
	 * 根据索引创建对应实现对象
	 * @param i 索引
	 * @return 对象接口
	 */
	public ITest getTest(int i);
}
