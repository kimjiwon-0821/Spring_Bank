package com.example.demo.domain;

import java.util.Date;

import lombok.Data;

@Data
public class Account {
	private Integer account;
	private String id;
	private Integer accPassword;
	private Integer accBalance;
	private Date accCreate;

}
