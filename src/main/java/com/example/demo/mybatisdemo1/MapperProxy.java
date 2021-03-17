package com.example.demo.mybatisdemo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类
 * 用来根据mapper对应XML文件中的方法名，找到SQL
 */
public class MapperProxy implements InvocationHandler {
	private final MySqlSession mySqlSession;

	public MapperProxy(MySqlSession mySqlSession) {
		this.mySqlSession = mySqlSession;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if (method.getDeclaringClass().getName().equals(MyConfiguration.MovieMapperXml.nameSpace)) {
			String sql = MyConfiguration.MovieMapperXml.methodSqlMapper.get(method.getName());
			return mySqlSession.selectOne(sql, String.valueOf(args[0]));
		}
		return method.invoke(this, args);
	}
}
