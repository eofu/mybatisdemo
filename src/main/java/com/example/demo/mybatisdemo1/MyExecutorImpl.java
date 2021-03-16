package com.example.demo.mybatisdemo1;

import com.example.demo.entity.Movie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MyExecutorImpl implements MyExecutor {
	@Override
	public <T> T query(String statment, String parameter) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		Movie movie = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=UTF-8", "root", "Ys199507");
			preparedStatement = connection.prepareStatement(String.format(statment, Integer.parseInt(parameter)));
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				movie = new Movie();
				movie.setId(resultSet.getLong(1));
				movie.setTitle(resultSet.getString(2));
				movie.setPicUrl(resultSet.getString(3));
				movie.setTargetUrl(resultSet.getString(4));
				movie.setIntroduction(resultSet.getString(5));
				movie.setDownloadUrl(resultSet.getString(6));
				movie.setCreateTime(resultSet.getTimestamp(7));
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return (T) movie;
	}
}
