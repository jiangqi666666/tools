package com.jiangqi.gof23.flyweight;

public class Main {

	/**
	 * 享元模式：Flyweight
	 * 运用共享技术有效支持大量细粒度对象；
	 * 
	 * 将共享的对象先实例化到内存中，客户端请求时系统返回可用实例并加锁，如无实例则创建之，具体见连接共享池
	 * 
	 * 也就是说在一个系统中如果有多个相同的对象，那么只共享一份就可以了，不必每个都去实例化一个对象。
	 * 比如说一个文本系统，每个字母定一个对象，那么大小写字母一共就是52个，那么就要定义52个对象。
	 * 如果有一个1M的文本，那么字母是何其的多，如果每个字母都定义一个对象那么内存早就爆了。
	 * 那么如果要是每个字母都共享一个对象，那么就大大节约了资源。
	 * 在Flyweight模式中，由于要产生各种各样的对象，所以在Flyweight(享元)模式中常出现Factory模式。
	 * Flyweight的内部状态是用来共享的,
	 * Flyweight factory负责维护一个对象存储池（Flyweight Pool）来存放内部状态的对象。
	 * Flyweight模式是一个提高程序效率和性能的模式,会大大加快程序的运行速度.应用场合很多：
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FlyweightFactory f=new FlyweightFactory();
		
		IFlyweight fx=f.getFlyWeight("X");
		fx.Operation();
		
		fx=f.getFlyWeight("Y");
		fx.Operation();
		
		fx=f.getFlyWeight("Z");
		fx.Operation();
		
		fx=f.getFlyWeight("Z");
		fx.Operation();
		
		fx=f.getFlyWeight("X");
		fx.Operation();
		
		System.out.println("享元数量："+f.getFlyweightSize());
		
	}

}
