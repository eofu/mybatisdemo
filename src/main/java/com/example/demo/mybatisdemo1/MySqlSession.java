package com.example.demo.mybatisdemo1;

public class MySqlSession {
	private final MyConfiguration myConfiguration;
	private final MyExecutor myExecutor;

	public MySqlSession(MyConfiguration myConfiguration, MyExecutor myExecutor) {
		this.myConfiguration = myConfiguration;
		this.myExecutor = myExecutor;
	}

	public <T> T getMapper(Class<T> clazz) {
		return (T) myConfiguration.getMapper(clazz, this);
	}

	public <T> T selectOne(String statment, String parameter) {
		return myExecutor.query(statment, parameter);
	}


}
