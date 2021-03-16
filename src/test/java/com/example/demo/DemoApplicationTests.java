package com.example.demo;


import com.example.demo.dao.MovieDao;
import com.example.demo.entity.Movie;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class DemoApplicationTests {
	@Resource
	private MovieDao movieDao;


	@Test
	void contextLoads() {
		Movie movie = movieDao.queryById(1L);
		System.out.println(movie.toString());
	}

}
