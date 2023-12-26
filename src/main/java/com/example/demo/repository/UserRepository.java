package com.example.demo.repository;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Account;
import com.example.demo.domain.User;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class UserRepository {
	private final SqlSessionTemplate mybatis;
	
	public User getUser(String id) {
		return mybatis.selectOne("getUser", id);
	}
	public void insertUser(User user) {
		mybatis.insert("insertUser", user);
	}
	
	public void insertAccount(Account account) {
		mybatis.insert("insertAccount",account);
	}

}
