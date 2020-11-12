package com.jiangqi.tools.serializable;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import com.caucho.hessian.io.HessianInput;
import com.caucho.hessian.io.HessianOutput;

/**
 * Hessian���л�����
 * @author jiangqi
 *
 */
public class Hessian {

	/**
	 * �Ѷ������л�Ϊ�ֽ�
	 * @param obj ��Ҫ���л��Ķ��󣬱���̳�Serializable�ӿ�
	 * @return
	 * @throws IOException
	 */
	public static byte[] toSerializable(Object obj) throws IOException{
		ByteArrayOutputStream os=new ByteArrayOutputStream();
		HessianOutput out = new HessianOutput(os);
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
		HessianInput in = new HessianInput(os);
		return in.readObject();
	}
}
