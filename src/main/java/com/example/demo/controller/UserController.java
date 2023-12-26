package com.example.demo.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequiredArgsConstructor
public class UserController {
	
	private final UserService userService;
	private final BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@GetMapping("index")
	public String index() {
		return "index";
	}
	
	
	@GetMapping("login")
	public String login() {
		return "login";
	}
//	@PostMapping("login")
//	public String login(User user) {
//		user = userService.getUSer(user.getId());
//		if(user!=null) {
//			return "redirect:/index";
//		}
//		return null;
//	}
	
	
	@GetMapping("join")
	public String join() {
		return "join";
	}
	@PostMapping("join")
	public String join(User user) {
		String rawPassword = user.getPassword();
		String encPassword = bCryptPasswordEncoder.encode(rawPassword);
		user.setPassword(encPassword);
		userService.insertUser(user);
		return "redirect:/login";
	}
	

}
