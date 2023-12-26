package com.example.demo.domain;


import lombok.Data;

@Data
public class User {
	private String id;
	private String password;
//	private String name;
//	private Integer phone;
//	private String email;
//	private Date joinDate;
//	private Integer notifyEnable;
	private String role;
	private Integer accPassword;
	
}
