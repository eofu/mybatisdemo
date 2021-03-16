package com.example.demo.service.impl;

import com.example.demo.dao.MovieDao;
import com.example.demo.entity.Movie;
import com.example.demo.service.MovieService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Movie)表服务实现类
 *
 * @author makejava
 * @since 2021-03-16 14:24:58
 */
@Service("movieService")
public class MovieServiceImpl implements MovieService {
	@Resource
	private MovieDao movieDao;

	/**
	 * 通过ID查询单条数据
	 *
	 * @param id 主键
	 * @return 实例对象
	 */
	@Override
	public Movie queryById(Long id) {
		return this.movieDao.queryById(id);
	}

	/**
	 * 查询多条数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	@Override
	public List<Movie> queryAllByLimit(int offset, int limit) {
		return this.movieDao.queryAllByLimit(offset, limit);
	}

	/**
	 * 新增数据
	 *
	 * @param movie 实例对象
	 * @return 实例对象
	 */
	@Override
	public Movie insert(Movie movie) {
		this.movieDao.insert(movie);
		return movie;
	}

	/**
	 * 修改数据
	 *
	 * @param movie 实例对象
	 * @return 实例对象
	 */
	@Override
	public Movie update(Movie movie) {
		this.movieDao.update(movie);
		return this.queryById(movie.getId());
	}

	/**
	 * 通过主键删除数据
	 *
	 * @param id 主键
	 * @return 是否成功
	 */
	@Override
	public boolean deleteById(Long id) {
		return this.movieDao.deleteById(id) > 0;
	}
}
