package com.webApp.Demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.webApp.Demo.controller.BookRepository;
import com.webApp.Demo.domain.Book;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
@Autowired
private BookRepository bookRepo;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		bookRepo.save(new Book(1,"From North Land","www.fromnorth.com",null));
		bookRepo.save(new Book(2,"The World War","www.worldwar.com",null));
		bookRepo.save(new Book(3,"Apple","www.apple.com",null));
		bookRepo.save(new Book(4,"My Eyes","www.eyes.com",null));
	}
	
}
