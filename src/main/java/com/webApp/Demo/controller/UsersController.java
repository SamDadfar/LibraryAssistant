package com.webApp.Demo.controller;

import javax.ws.rs.Consumes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.webApp.Demo.domain.Users;
import com.webApp.Demo.exceptions.UserNotFoundException;

@RequestMapping("/api/users")
@RestController
public class UsersController {

	@Autowired
	private UsersService service;

	@GetMapping("/all")
	public String hello() {
		return "hello";
	}

	@PreAuthorize("hasAnyRole('ADMIN')")
	@GetMapping("/resource/all")
	public String secureHello() {
		return "Secured Hello";
	}
	@GetMapping("/userslogin")
	public String login() {
		return "loginPage";
	}
	@PostMapping("/")
	@Consumes("application/json")
	public String greeting(@RequestBody Users user) {
		Users tempUser = service.findByUserName(user.getName()).orElseThrow(() -> new UserNotFoundException());
		return "Hi" + tempUser.getName();
	}
}
