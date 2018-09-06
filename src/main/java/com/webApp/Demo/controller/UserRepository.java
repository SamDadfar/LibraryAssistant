package com.webApp.Demo.controller;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;	
import com.webApp.Demo.domain.Users;

public interface UserRepository extends JpaRepository<Users,Long> {
	public Optional<Users> findByName(String username);
}
