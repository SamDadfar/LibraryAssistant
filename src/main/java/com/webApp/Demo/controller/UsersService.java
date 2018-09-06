package com.webApp.Demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.webApp.Demo.domain.Users;

@Component
@Service
public class UsersService {
	@Autowired
	private UserRepository repository;
	
	public Optional<Users> findByUserName(String username) {
		return repository.findByName(username);
	}
	
}
