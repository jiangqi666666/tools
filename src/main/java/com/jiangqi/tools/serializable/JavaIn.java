package com.jiangqi.tools.serializable;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Java ���õ����л�����
 * @author jiangqi
 *
 */
public class JavaIn {

	/**
	 * �Ѷ������л�Ϊ�ֽ�
	 * @param obj ��Ҫ���л��Ķ��󣬱���̳�Serializable�ӿ�
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
	 * ���ֽڷ����л��ɶ���
	 * @param obj ��Ҫ�����л����ֽ�
	 * @return
	 * @throws IOException
	 */
	public static Object getSerializable(byte[] obj) throws IOException, ClassNotFoundException{
		ByteArrayInputStream os=new ByteArrayInputStream(obj);
		ObjectInputStream in = new ObjectInputStream(os);
		return in.readObject();
	}
}
