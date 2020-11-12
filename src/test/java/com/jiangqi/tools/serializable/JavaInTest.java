package com.jiangqi.tools.serializable;

import java.io.IOException;

import com.jiangqi.tools.testBean.TestOne;
import com.jiangqi.tools.testBean.TestTwo;

import junit.framework.TestCase;

public class JavaInTest extends TestCase {
	private TestTwo testBean;
	private byte[] obj=null;
	
	protected void setUp() throws Exception {
		super.setUp();
		
		this.testBean=new TestTwo();
		this.testBean.setA(100);
		this.testBean.setB(200);
		for(int i=0;i<4;i++){
			TestOne tmp=new TestOne();
			tmp.setA(i);
			tmp.setB(true);
			tmp.setC(String.valueOf(i));
			this.testBean.getOne().add(tmp);
		}
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testToSerializable() {
		//fail("Not yet implemented");
		byte[] ret=null;
		try {
			ret=JavaIn.toSerializable(this.testBean);
			System.out.println(ret);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertNull("序列化对象产生的字节数为空！！",ret);
	}

	public void testGetSerializable() {
		//fail("Not yet implemented");
		Object o=null;
		try {
			o=JavaIn.getSerializable(this.obj);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertNull("反序列化对象失败！！",o);
	}

}
