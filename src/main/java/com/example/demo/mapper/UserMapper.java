package com.example.demo.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.domain.User;

@Mapper
public interface UserMapper {
	
	@Select("SELECT * FROM USER WHERE ID=#{id}")
	public User getUser(String id);
	
	@Insert("INSERT INTO USER VALUES(#{id},#{password},#{role})")
	public void insertUser(User user);

}
