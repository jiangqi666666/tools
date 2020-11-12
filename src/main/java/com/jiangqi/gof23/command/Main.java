package com.jiangqi.gof23.command;

public class Main {

	/**
	 * 命令模式：Command
	 * 将一个请求封装为一个对象，从而使你可以用不同的请求对客户进行参数化。
	 * 用于“行为请求者”与“行为实现者”解耦，可实现二者之间的松耦合
	 * ，以适应变化。分离变化与不变的因素。
	 * 在面向对象的设计中，一个对象调用另一个对象，一般情况下的调用过程是：创建目标实例、设置调用参数、调用目标方法。
	 * 但有些情况下，有必要使用一个专门的类对这种调用过程加以封装，我们把这种类叫Command；
	 * 
	 * Command模式可用于：
	 * 	1、这个调用过程比较繁杂或存在多种调用，这是用Command类对该调用进行封装，便于功能再利用。
	 * 	2、调用前后需要对调用参数进行某些处理。
	 * 	3、调用前后需要进行模型额外处理，比如日志、缓存、记录历史操作等。
	 * 
	 * Command模式有如下效果：
	 * 	1、将调用操作的对象和知道如何操作实现的对象解耦；
	 * 	2、Command是头等对象，他们可以像其他对象一样被构造和扩展
	 * 	3、你可以多个命令装配成一个复合命令
	 * 	4、增加新的Command很容易，因为无需改变实现类
	 * 
	 * 应用场景：
	 * 	1、命令模式作为“CallBack”在面向对象系统中的替代，先登记一个函数，后面再调用这个函数。
	 * 
	 * 	2、需要在不同的时间指定请求、将请求排队。一个命令对象和原先的请求发出者可以用不同的生命周期。
	 * 换言之，原先的请求发出者可能已经不存在了，可命令对象本身仍然是活动的。这时命令的接收者可能在本地，
	 * 也可能在网络的另外一个地址。命令对象可以串行化之后传送到另外一台机器上去。
	 * 
	 * 	3、系统需要支持命令的撤销（undo）。命令对象可以把状态存储起来，等客户端需要撤销命令所产生的效果时，
	 * 抵用undo方法，把命令所产生的效果撤销掉。命令对象还可以提供redo 方法，供客户端在需要时，再重新实施命令效果。
	 * 
	 * 	4、如果一个系统将系统中所有的数据更新到日志，以便系统崩溃时，可以根据日志里读回所有的数据更新命令，
	 * 重新调用Execute方法一条条执行这些命令，从而恢复系统在崩溃前所做的数据快更新。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		//创建命令信息
		CommandInfo info=new CommandInfo();
		info.setId(1);
		info.setPar1("par1");
		info.setPar2("par2");
		
		//创建命令对象，并设置它的接收者
		ConcreteCommand<CommandInfo> c=new ConcreteCommand<CommandInfo>(info);
		//创建接收站
		c.addReceiver(new Receiver2());
		c.addReceiver(new Receiver1());

		//创建Invoker
		Invoker i=new Invoker();
		//把命令对象设置进去
		i.setCommand(c);
		i.executeCommand();
	}
}
