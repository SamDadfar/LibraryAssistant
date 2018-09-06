package com.webApp.Demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webApp.Demo.domain.Book;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepo;
	public Iterable<Book> findAll(){
		return bookRepo.findAll();
	}
	public Optional<Book> findOne(long id){
		return bookRepo.findOne(id);
	}
	public void save(Book book) {
		bookRepo.save(book);
	}
	public void delete(long id) {
		bookRepo.deleteById(id);
	}
}
