package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.domain.Account;
import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	private final UserRepository userRepository;
	
	public User getUSer(String id) {
		return userRepository.getUser(id);
	}
	
	public void insertUser(User user) {
		userRepository.insertUser(user);
	}
	
	public void insertAccount(Account account) {
		userRepository.insertAccount(account);
	}

}
