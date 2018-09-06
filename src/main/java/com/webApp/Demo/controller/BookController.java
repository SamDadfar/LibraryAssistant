package com.webApp.Demo.controller;

import java.util.*;
import javax.persistence.PostRemove;
import javax.ws.rs.DefaultValue;

import org.h2.mvstore.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.webApp.Demo.domain.Book;

import aj.org.objectweb.asm.Attribute;
@Controller
@RequestMapping("/")
public class BookController {
	@Autowired
	private BookService bookService;
	
	@RequestMapping("/books")
	//@ModelAttribute("data")
	public @ResponseBody Iterable<Book> show() {
		return bookService.findAll();
	}
	@PostMapping("/save")
	public String save(Book book) {
		bookService.save(book);
		return "/redirect:/";
	}
	@GetMapping("/delete")
	public String delete(long id) {
		bookService.delete(id);
		return "/redirect:/";
	}
	@GetMapping("/findOne")
	@ResponseBody
	public Book findOne(long id) {
		return bookService.findOne(id).orElseThrow(()->new RuntimeException());
	}
}
