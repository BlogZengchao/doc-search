package com.zc.docsearch.common;

import com.xiaoleilu.hutool.crypto.SecureUtil;

import java.util.Map;
import java.util.TreeMap;

public class SignUtils {
	/**
	 * 生成session
	 * @param data 参数map
	 * @param params 可变参数，顺序按字母顺序传递，session除外
	 * @return
	 */
	public static String getSession(Map<String,Object> data,String... params){
		StringBuilder paramStr = new StringBuilder();
		paramStr.append(Constant.AUTHID);
		for(int i = 0; i < params.length; i++){
			paramStr.append(params[i]+"="+data.get(params[i])+"&");
		}
		paramStr.deleteCharAt(paramStr.length()-1);
		paramStr.append(Constant.AUTHID);
		System.out.println(paramStr.toString());
		String session = SecureUtil.md5(paramStr.toString()).toUpperCase();
		return session;
	}

	/**
	 * 生成session
	 * @param data 参数 键值对
	 * @return
	 */
	public static String getSign(Map<String,Object> data){
		StringBuilder paramStr = new StringBuilder();
		paramStr.append(Constant.AUTHID);
		TreeMap<String,Object> treeMap=new TreeMap<>(data);
		for (Map.Entry<String,Object> entry:treeMap.entrySet()){
			paramStr.append(entry.getKey()).append("=").append("&");
		}
		paramStr.deleteCharAt(paramStr.length()-1);
		paramStr.append(Constant.AUTHID);
		return SecureUtil.md5(paramStr.toString()).toUpperCase();
	}
}
