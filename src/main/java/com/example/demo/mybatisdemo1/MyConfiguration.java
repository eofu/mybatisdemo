package com.example.demo.mybatisdemo1;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class MyConfiguration {

	public <T> Object getMapper(Class<T> clazz, MySqlSession mySqlSession) {
		return Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{clazz}, new MapperProxy(mySqlSession));
	}

	/**
	 * Xml解析
	 */
	static class MovieMapperXml {
		public static final String nameSpace = "com.example.demo.mybatisdemo1.MovieMapper";

		public static final Map<String, String> methodSqlMapper = new HashMap();

		static {
			methodSqlMapper.put("selectByPrimaryKey", "select * from movie where id =%d");
		}
	}
}
