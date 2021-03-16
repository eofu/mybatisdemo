package com.example.demo.dao;

import com.example.demo.entity.Movie;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Movie)表数据库访问层
 *
 * @author makejava
 * @since 2021-03-16 14:24:57
 */
public interface MovieDao {

	/**
	 * 通过ID查询单条数据
	 *
	 * @param id 主键
	 * @return 实例对象
	 */
	Movie queryById(Long id);

	/**
	 * 查询指定行数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	List<Movie> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


	/**
	 * 通过实体作为筛选条件查询
	 *
	 * @param movie 实例对象
	 * @return 对象列表
	 */
	List<Movie> queryAll(Movie movie);

	/**
	 * 新增数据
	 *
	 * @param movie 实例对象
	 * @return 影响行数
	 */
	int insert(Movie movie);

	/**
	 * 批量新增数据（MyBatis原生foreach方法）
	 *
	 * @param entities List<Movie> 实例对象列表
	 * @return 影响行数
	 */
	int insertBatch(@Param("entities") List<Movie> entities);

	/**
	 * 批量新增或按主键更新数据（MyBatis原生foreach方法）
	 *
	 * @param entities List<Movie> 实例对象列表
	 * @return 影响行数
	 */
	int insertOrUpdateBatch(@Param("entities") List<Movie> entities);

	/**
	 * 修改数据
	 *
	 * @param movie 实例对象
	 * @return 影响行数
	 */
	int update(Movie movie);

	/**
	 * 通过主键删除数据
	 *
	 * @param id 主键
	 * @return 影响行数
	 */
	int deleteById(Long id);

}

