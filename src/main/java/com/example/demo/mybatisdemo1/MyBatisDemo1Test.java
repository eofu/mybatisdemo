package com.example.demo.mybatisdemo1;

import com.example.demo.entity.Movie;

/**
 * 1、根据传入配置文件和执行器创建会话；
 * 2、获取mapper的代理对象
 */
public class MyBatisDemo1Test {
	public static void main(String[] args) {
		MySqlSession mySqlSession = new MySqlSession(new MyConfiguration(), new MyExecutorImpl());
		// 为Mapper生成动态代理对象
		MovieMapper mapper = mySqlSession.getMapper(MovieMapper.class);
		Movie movie = mapper.selectByPrimaryKey(2);
		System.out.println(movie);
	}
}
