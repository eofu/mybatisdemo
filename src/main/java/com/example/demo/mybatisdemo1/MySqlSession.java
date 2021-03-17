package com.example.demo.mybatisdemo1;

// SqlSession会话
// 两个功能：
// 1、通过动态代理获取到对应mapper对象
// 2、执行mapper中的方法
public class MySqlSession {
	// 配置器
	private final MyConfiguration myConfiguration;
	// 执行器
	private final MyExecutor myExecutor;

	public MySqlSession(MyConfiguration myConfiguration, MyExecutor myExecutor) {
		this.myConfiguration = myConfiguration;
		this.myExecutor = myExecutor;
	}

	public <T> T getMapper(Class<T> clazz) {
		return (T)myConfiguration.getInstanceMapper(clazz, this);
	}

	public <T> T selectOne(String statment, String parameter) {
		return myExecutor.query(statment, parameter);
	}
}
