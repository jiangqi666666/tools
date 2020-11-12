package com.jiangqi.tools.beanmanager;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

/**
 * 将对象序列化为一个xml文件； 反序列化xml文件成对象
 * 
 * @author jiangqi
 *
 */
public class XmlSerialize {

	/**
	 * 序列化单个对象为xml文件
	 * @param os xml文件输出流
	 * @param obj 需要序列化的对象
	 */
	public static void serializeSingleObject(OutputStream os, Object obj) // 序列化单个java对象
	{
		// XMLEncoder xe = new XMLEncoder(os);
		XMLEncoder xe = new XMLEncoder(os, "GBK", true, 0); // 仅用于Java SE 7
		xe.writeObject(obj); // 序列化成XML字符串
		xe.close();
	}

	/**
	 * 反序列化xml文件为一个对象
	 * @param is xml文件输入流
	 * @return 反序列化成功的对象
	 */
	public static Object deserializeSingleObject(InputStream is) // 反序列化单个Java对象
	{
		XMLDecoder xd = new XMLDecoder(is);
		Object obj = xd.readObject(); // 从XML序列中解码为Java对象
		xd.close();
		return obj;
	}

	/**
	 * 序列化多个对象为xml文件
	 * @param os xml文件输出流
	 * @param objs 需要序列化的对象
	 */
	public static void serializeMultipleObject(OutputStream os, List<Object> objs) // 序列化多个Java对象
	{
		XMLEncoder xe = new XMLEncoder(os);
		xe.writeObject(objs); // 序列化成XML字符串
		xe.close();
	}

	/**
	 * 反序列化xml文件为多个对象
	 * @param is xml文件输入流
	 * @return 反序列化成功的对象
	 */
	public static List<Object> deserializeMultipleObject(InputStream is) // 反序列化多个Java对象
	{
		XMLDecoder xd = new XMLDecoder(is);
		@SuppressWarnings("unchecked")
		List<Object> objs = (List<Object>) xd.readObject(); // 从XML序列中解码为Java对象列表
		xd.close();
		return objs;
	}

	/*
	 * public void runSingleObject(Object bean) { File xmlFile = new
	 * File("e://object.xml");
	 * 
	 * try { FileOutputStream ofs = new FileOutputStream(xmlFile); // 创建文件输出流对象
	 * serializeSingleObject(ofs, bean); ofs.close(); } catch
	 * (FileNotFoundException e) { e.printStackTrace(); } catch (IOException e)
	 * { e.printStackTrace(); }
	 * 
	 * try { FileInputStream ifs = new FileInputStream(xmlFile); Object jo4In =
	 * deserializeSingleObject(ifs);
	 * 
	 * } catch (FileNotFoundException e) { e.printStackTrace(); } }
	 * 
	 * public void runMultipleObject(List<Object> beans) { File xmlFile = new
	 * File("objects.xml");
	 * 
	 * try { FileOutputStream ofs = new FileOutputStream(xmlFile); // 创建文件输出流对象
	 * serializeSingleObject(ofs, beans); ofs.close(); } catch
	 * (FileNotFoundException e) { e.printStackTrace(); } catch (IOException e)
	 * { e.printStackTrace(); }
	 * 
	 * try { FileInputStream ifs = new FileInputStream(xmlFile);
	 * 
	 * @SuppressWarnings("unchecked") List<Object> sos4In =
	 * (List<Object>)deserializeSingleObject(ifs); for(Object jo4In : sos4In) {
	 * 
	 * } } catch (FileNotFoundException e) { e.printStackTrace(); } }
	 * 
	 * public static void main(String[] args) { XmlSerialize xs = new
	 * XmlSerialize();
	 * 
	 * xs.runSingleObject(); xs.runMultipleObject(); }
	 */
}
