package com.example.demo.test;

public class NormalExecutor extends AbstractExecutor {
	@Override
	public void payMent() {
		System.out.println("son payment");
		super.payMent();
	}

	@Override
	public String isSuccess() {
		return super.isSuccess();
	}
}
