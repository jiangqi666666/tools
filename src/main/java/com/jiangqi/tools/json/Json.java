package com.jiangqi.tools.json;

import net.sf.json.JSONObject;
import net.sf.json.xml.XMLSerializer;

public class Json {
	
	private Json() {}

	public static String entity2JSON(Object value) {
		JSONObject jsonObject=JSONObject.fromObject(value);
		return jsonObject.toString();
	}
	
	public static Object jSON2Entity(String str) {
		JSONObject jsonObject=JSONObject.fromObject(str);
		return JSONObject.toBean(jsonObject);
	}
	
	public static String json2xml(Object value) {
		JSONObject jsonObject=JSONObject.fromObject(value);
		XMLSerializer xmlSerializer = new XMLSerializer();  
		return xmlSerializer.write(jsonObject);  
		
	}
}
