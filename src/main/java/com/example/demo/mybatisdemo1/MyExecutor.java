package com.example.demo.mybatisdemo1;

public interface MyExecutor {
	<T> T query(String statment, String parameter);
}
