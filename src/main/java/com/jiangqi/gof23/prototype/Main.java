package com.jiangqi.gof23.prototype;

public class Main {

	/**
	 * 原型模式 Prototype
	 * 通过克隆完成类实体的复制,分为浅复制和深复制
	 * 浅复制：复制实体中包含的对象时，只复制了指针引用，不复制指针对应的类；
	 * 深复制：所有类和类内的对象都复制，需注意复制深度和对象间引用关系，防止造成死循环
	 */
	public static void main(String[] args) {
		
		//浅复制对象
		OneTest one=new OneTest();
		TwoTest two=new TwoTest();
		two.setOne(one);
		
		//深复制对象
		AllOneTest allOne=new AllOneTest();
		AllTwoTest allTwo=new AllTwoTest();
		allTwo.setOne(allOne);
		
		try {
			//浅复制
			TwoTest test1=(TwoTest)two.clone();
			//深复制
			AllTwoTest test2=(AllTwoTest)allTwo.clone();
			
			//复制前取值
			System.out.println("浅复制复制前取值------------");
			System.out.println(test1.getI());
			System.out.println(test1.getOne().getI());
			System.out.println("深复制复制前取值------------");
			System.out.println(test2.getI());
			System.out.println(test2.getOne().getI());
			
			//修改原对象内容，验证复制情况
			two.setI("这是浅复制对象One修改值！！");
			
			two.getOne().setI("这是浅复制对象Two修改值！！");
			allTwo.setI("这是深复制对象One修改值！！");
			allTwo.getOne().setI("这是深复制对象Two修改值！！");
						
			//复制后取值
			System.out.println("浅复制复制后取值------------");
			System.out.println(test1.getI());
			System.out.println(test1.getOne().getI());
			System.out.println("深复制复制后取值------------");
			System.out.println(test2.getI());
			System.out.println(test2.getOne().getI());
			
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
		
		
	}

}
