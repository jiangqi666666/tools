package com.jiangqi.tools.beanmanager;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

/**
 * ���������л�Ϊһ��xml�ļ��� �����л�xml�ļ��ɶ���
 * 
 * @author jiangqi
 *
 */
public class XmlSerialize {

	/**
	 * ���л���������Ϊxml�ļ�
	 * @param os xml�ļ������
	 * @param obj ��Ҫ���л��Ķ���
	 */
	public static void serializeSingleObject(OutputStream os, Object obj) // ���л�����java����
	{
		// XMLEncoder xe = new XMLEncoder(os);
		XMLEncoder xe = new XMLEncoder(os, "GBK", true, 0); // ������Java SE 7
		xe.writeObject(obj); // ���л���XML�ַ���
		xe.close();
	}

	/**
	 * �����л�xml�ļ�Ϊһ������
	 * @param is xml�ļ�������
	 * @return �����л��ɹ��Ķ���
	 */
	public static Object deserializeSingleObject(InputStream is) // �����л�����Java����
	{
		XMLDecoder xd = new XMLDecoder(is);
		Object obj = xd.readObject(); // ��XML�����н���ΪJava����
		xd.close();
		return obj;
	}

	/**
	 * ���л��������Ϊxml�ļ�
	 * @param os xml�ļ������
	 * @param objs ��Ҫ���л��Ķ���
	 */
	public static void serializeMultipleObject(OutputStream os, List<Object> objs) // ���л����Java����
	{
		XMLEncoder xe = new XMLEncoder(os);
		xe.writeObject(objs); // ���л���XML�ַ���
		xe.close();
	}

	/**
	 * �����л�xml�ļ�Ϊ�������
	 * @param is xml�ļ�������
	 * @return �����л��ɹ��Ķ���
	 */
	public static List<Object> deserializeMultipleObject(InputStream is) // �����л����Java����
	{
		XMLDecoder xd = new XMLDecoder(is);
		@SuppressWarnings("unchecked")
		List<Object> objs = (List<Object>) xd.readObject(); // ��XML�����н���ΪJava�����б�
		xd.close();
		return objs;
	}

	/*
	 * public void runSingleObject(Object bean) { File xmlFile = new
	 * File("e://object.xml");
	 * 
	 * try { FileOutputStream ofs = new FileOutputStream(xmlFile); // �����ļ����������
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
	 * try { FileOutputStream ofs = new FileOutputStream(xmlFile); // �����ļ����������
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
