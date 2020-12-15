package com.jiangqi.tools.json;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

public class JsonTest extends TestCase {
	
	public class One{
		private int a;
		private String b;
		
		public One(){
			
		}
		
		public int getA() {
			return a;
		}
		public void setA(int a) {
			this.a = a;
		}
		public String getB() {
			return b;
		}
		public void setB(String b) {
			this.b = b;
		}
		
		
	};
	
	public class Two{
		private int a;
		private List<One> b=new ArrayList<One>();
		
		public Two(){
			
		}
		
		public int getA() {
			return a;
		}
		public void setA(int a) {
			this.a = a;
		}
		public List<One> getB() {
			return b;
		}
		public void setB(List<One> b) {
			this.b = b;
		}
	};
	
	private Two aa;

	protected void setUp() throws Exception {
		super.setUp();
		
		this.aa=new Two();
		this.aa.setA(100);
		for(int i=0;i<3;i++){
			One one=new One();
			one.setA(i);
			one.setB(String.valueOf(i));
			
			this.aa.getB().add(one);
		}
		
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testEntity2JSON() {
		//fail("Not yet implemented");
		String ss=Json.entity2JSON( this.aa);
		System.out.println("ss="+ss);
		
		//assertNull("返回字符串为空",ss); 
	}
	
	public void testJson2xml() {
		//fail("Not yet implemented");
		String ss=Json.json2xml( this.aa);
		System.out.println("ss="+ss);
		
		assertNull("返回字符串为空",ss); 
	}

	public void testJSON2Entity() {
		//fail("Not yet implemented");
		//String tmp="{\"a\":100,\"b\":[{\"a\":0,\"b\":\"0\"},{\"a\":1,\"b\":\"1\"},{\"a\":2,\"b\":\"2\"}]}";
		
		String tmp=Json.entity2JSON(this.aa);
		
		Object www=Json.jSON2Entity(tmp,Two.class);
		if(www!=null)
			System.out.println(www);
		else
			System.out.println("SSSSSSSSSSS");
		
		assertNull("返回对象为空",www); 
	}
	
}
