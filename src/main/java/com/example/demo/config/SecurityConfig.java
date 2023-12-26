package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	//비밀번호 Bcrypt화 - security 제공 라이브러리
	@Bean
	public BCryptPasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
		http.csrf().disable();
		http.authorizeRequests()
//			.requestMatchers(new AntPathRequestMatcher("/user/**")).authenticated()
//			.requestMatchers(new AntPathRequestMatcher("/manager/**")).access("hasRole('ROLE_ADMIN')OR hasRole('ROLE_MANAGER')")
//			.requestMatchers(new AntPathRequestMatcher("/admin/**")).access("hasRole('ROLE_ADMIN')")
			.requestMatchers(new AntPathRequestMatcher("/index/**")).authenticated()
			.anyRequest().permitAll()
			.and()
			.formLogin()
			.loginPage("/login")
			.usernameParameter("id") // principleDetailsService의 매개변수가 username으로 하기 싫으면 여기서 변경
			.loginProcessingUrl("/login")
			.defaultSuccessUrl("/index");
		return http.build();
	}

}
