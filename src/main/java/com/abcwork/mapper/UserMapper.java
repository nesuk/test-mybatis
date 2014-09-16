package com.abcwork.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.abcwork.entity.User;

public interface UserMapper {

	User get(Long uid);

	List<User> getAll();

	void add(User user);
	
	List<User> getByPage(@Param(value="start")Integer start, @Param(value="count")Integer count);
}
