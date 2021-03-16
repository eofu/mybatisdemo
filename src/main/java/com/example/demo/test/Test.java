package com.example.demo.test;

public class Test {
	public static void main(String[] args) {
		NormalExecutor normalExecutor = new NormalExecutor();
		normalExecutor.payMent();
	}

	public void hello() {
		System.out.println("public");
	}

	private void hello2() {
		hello();
	}


}
