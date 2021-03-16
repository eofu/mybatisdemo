package com.example.demo.controller;

import com.example.demo.entity.Movie;
import com.example.demo.service.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Movie)表控制层
 *
 * @author makejava
 * @since 2021-03-16 14:24:58
 */
@RestController
@RequestMapping("movie")
public class MovieController {
	/**
	 * 服务对象
	 */
	@Resource
	private MovieService movieService;

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("selectOne")
	public Movie selectOne(Long id) {
		return this.movieService.queryById(id);
	}

}
