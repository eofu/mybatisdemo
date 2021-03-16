package com.example.demo.test;

public abstract class AbstractExecutor implements ExecutorDemo {
	@Override
	public void payMent() {
		System.out.println("father payment");
	}

	@Override
	public String isSuccess() {
		return "father success";
	}
}
