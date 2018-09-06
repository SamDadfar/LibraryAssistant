package com.webApp.Demo.controller;

import java.util.Optional;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.webApp.Demo.domain.Book;


public interface BookRepository extends JpaRepository<Book, Long> {

	public Optional<Book> findOne(long id);
}
