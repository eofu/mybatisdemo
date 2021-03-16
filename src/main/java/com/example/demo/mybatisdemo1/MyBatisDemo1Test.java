package com.example.demo.mybatisdemo1;

import com.example.demo.entity.Movie;

public class MyBatisDemo1Test {
	public static void main(String[] args) {
		MySqlSession mySqlSession = new MySqlSession(new MyConfiguration(), new MyExecutorImpl());
		MovieMapper mapper = mySqlSession.getMapper(MovieMapper.class);
		Movie movie = mapper.selectByPrimaryKey(2);
		System.out.println(movie);
	}
}
