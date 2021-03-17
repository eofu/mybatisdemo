package com.example.demo.mybatisdemo1;

import com.example.demo.entity.Movie;

public interface MovieMapper {
	Movie selectByPrimaryKey(Integer mid);

	Movie selectByTitle(String mTitle);
}
