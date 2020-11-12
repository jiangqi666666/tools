package com.jiangqi.tools.serializable;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Java 内置的序列化方法
 * @author jiangqi
 *
 */
public class JavaIn {

	/**
	 * 把对象序列化为字节
	 * @param obj 需要序列化的对象，必须继承Serializable接口
	 * @return
	 * @throws IOException
	 */
	public static byte[] toSerializable(Object obj) throws IOException{
		ByteArrayOutputStream os=new ByteArrayOutputStream();
		ObjectOutputStream out = new ObjectOutputStream(os);
		out.writeObject(obj);
		return os.toByteArray();
			
	}
	
	/**
	 * 把字节反序列化成对象
	 * @param obj 需要反序列化的字节
	 * @return
	 * @throws IOException
	 */
	public static Object getSerializable(byte[] obj) throws IOException, ClassNotFoundException{
		ByteArrayInputStream os=new ByteArrayInputStream(obj);
		ObjectInputStream in = new ObjectInputStream(os);
		return in.readObject();
	}
}
