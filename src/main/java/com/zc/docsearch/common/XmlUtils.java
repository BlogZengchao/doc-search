package com.zc.docsearch.common;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

public class XmlUtils {
	/**
	 * 过滤XML中非法字符
	 * 
	 * @param s
	 * @return
	 */
	public static String filterSpecialCharOfXml(String s) {
		
		String reg = "[\\x00-\\x08\\x0b-\\x0c\\x0e-\\x1f]";// 过滤掉非法字符
		String replaceStr = s.replaceAll("&", "&amp;").replaceAll(reg, "").replaceAll("[\ud800\udc00-\udbff\udfff\ud800-\udfff]", "");  
		return replaceStr;
	}
	/**
	 * 将xml转成java对象
	 * 
	 * @param clazz
	 * @param xmlStr
	 * @return
	 */
	public static Object convertXmlStrToObject(@SuppressWarnings("rawtypes") Class clazz, String xmlStr) {
		Object xmlObject = null;
		try {
			JAXBContext context = JAXBContext.newInstance(clazz);
			// 进行将Xml转成对象的核心接口
			Unmarshaller unmarshaller = context.createUnmarshaller();
			StringReader sr = new StringReader(xmlStr);
			xmlObject = unmarshaller.unmarshal(sr);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return xmlObject;
	}
}
