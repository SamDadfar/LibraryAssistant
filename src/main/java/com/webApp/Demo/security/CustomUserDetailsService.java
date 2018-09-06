package com.webApp.Demo.security;

import java.util.Optional;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.webApp.Demo.controller.UserRepository;
import com.webApp.Demo.domain.CustomUserDetail;
import com.webApp.Demo.domain.Users;
import com.webApp.Demo.exceptions.UserNotFoundException;
@Component
@Service
public class CustomUserDetailsService implements UserDetailsService{
	@Autowired
	UserRepository userRepository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Users> opt=userRepository.findByName(username);
		Users users=opt.orElseThrow(()->new UserNotFoundException("User Not Found"));
		return new CustomUserDetail(users);
	}

}
