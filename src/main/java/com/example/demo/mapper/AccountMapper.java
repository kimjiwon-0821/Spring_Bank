package com.example.demo.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.Account;

@Mapper
public interface AccountMapper {
	
	@Insert("INSERT INTO ACCOUNTS(ID,ACCPASSWORD,ACCBALANCE,ACCCREATE) VALUES(#{id},#{accPassword},0,NOW())")
	public abstract void insertAccount(Account account);

}
