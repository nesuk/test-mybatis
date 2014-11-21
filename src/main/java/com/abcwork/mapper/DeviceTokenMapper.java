package com.abcwork.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.abcwork.entity.DeviceToken;

public interface DeviceTokenMapper {

	DeviceToken get(String token);

	List<DeviceToken> getAll();

	void add(DeviceToken user);

	List<DeviceToken> getByPage(@Param(value = "start") Integer start, @Param(value = "count") Integer count);
}
