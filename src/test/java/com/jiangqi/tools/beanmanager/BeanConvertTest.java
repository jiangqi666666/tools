package com.jiangqi.tools.beanmanager;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

import com.jiangqi.tools.beanmanager.testbean.OnePojo;
import com.jiangqi.tools.beanmanager.testbean.TwoDto;
import com.jiangqi.tools.beanmanager.testbean.TwoPojo;

import junit.framework.TestCase;

public class BeanConvertTest extends TestCase {
	
	private TwoPojo two;

	protected void setUp() throws Exception {
		super.setUp();
		
		OnePojo one=new OnePojo();
		one.setA1(100);
		one.setA2(200);
		one.setA3(300);
		
		this.two=new TwoPojo();
		two.setA1(100);
		two.setA2(200);
		two.setA3(one);
		two.setA4(new ArrayList<OnePojo>());
		
		for(int i=0;i<10;i++){
			OnePojo tmp=new OnePojo();
			tmp.setA1(i);
			tmp.setA2(i);
			tmp.setA3(i);
			
			two.getA4().add(tmp);
		}
		
		
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testPojo2Dto() {
		//fail("Not yet implemented");
		TwoDto twoDto=null;
		try {
			twoDto=(TwoDto)BeanConvert.pojo2Dto(this.two, "com.jiangqi.tools.beanmanager.testbean.TwoDto");
			twoDto.clearChangedFlag();
			//twoDto.restoreChangedValule();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IntrospectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//assertEquals
		super.assertNotNull("对象转换出错", twoDto);
	}

}
