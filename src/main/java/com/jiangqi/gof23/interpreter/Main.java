package com.jiangqi.gof23.interpreter;

public class Main {

	/**
	 * 解释器模式：interpreter
	 * 定义一个语言，定义它的文法的一种表示，并定义一个解释器，这个解释器使用该表示来解释语言中的句子
	 * 
	 * http://www.cnblogs.com/java-my-life/archive/2012/06/19/2552617.html
	 */
	public static void main(String[] args) {

		Context ctx = new Context();
        Variable x = new Variable("x");
        Variable y = new Variable("y");
        ctx.assign(x, false);
        ctx.assign(y, true);
        
        Constant c = new Constant(true);
        
        Expression exp = new Or(new And(c,x) , new And(y,new Not(x)));
        System.out.println("x=" + x.interpret(ctx));
        System.out.println("y=" + y.interpret(ctx));
        System.out.println(exp.toString() + "=" + exp.interpret(ctx));
	}
}
