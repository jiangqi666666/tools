package com.jiangqi.gof23.prototype;

public class Main {

	/**
	 * 原型模式 Prototype
	 * 通过克隆完成类实体的复制,分为浅复制和深复制
	 * 浅复制：复制实体中包含的对象时，只复制了指针引用，不复制指针对应的类；
	 * 深复制：所有类和类内的对象都复制，需注意复制深度和对象间引用关系，防止造成死循环
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//浅复制对象
		OneTest one=new OneTest();
		TwoTest two=new TwoTest();
		two.one=one;
		
		//深复制对象
		AllOneTest allOne=new AllOneTest();
		AllTwoTest allTwo=new AllTwoTest();
		allTwo.one=allOne;
		
		try {
			//浅复制
			TwoTest test1=(TwoTest)two.clone();
			//深复制
			AllTwoTest test2=(AllTwoTest)allTwo.clone();
			
			//复制前取值
			System.out.println("浅复制复制前取值------------");
			System.out.println(test1.i);
			System.out.println(test1.one.i);
			System.out.println("深复制复制前取值------------");
			System.out.println(test2.i);
			System.out.println(test2.one.i);
			
			//修改原对象内容，验证复制情况
			two.i="这是浅复制对象One修改值！！";
			two.one.i="这是浅复制对象Two修改值！！";
			allTwo.i="这是深复制对象One修改值！！";
			allTwo.one.i="这是深复制对象Two修改值！！";
						
			//复制后取值
			System.out.println("浅复制复制后取值------------");
			System.out.println(test1.i);
			System.out.println(test1.one.i);
			System.out.println("深复制复制后取值------------");
			System.out.println(test2.i);
			System.out.println(test2.one.i);
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
