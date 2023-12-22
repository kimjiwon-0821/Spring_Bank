package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.domain.User;

@Mapper
public interface UserMapper {
	
	@Select("SELECT * FROM USER WHERE USERNAME=#{username}")
	public User getUser(String id);

}
