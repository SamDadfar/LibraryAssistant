package com.webApp.Demo.domain;

import java.util.*;
import javax.persistence.*;

@Table(name = "book")
@Entity(name = "Book")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "book_id")
	private long bookId;
	@Column(name = "book_name")
	private String bookName;
	
	@Column(name = "book_url")
	private String bookUrl;
	private List<BookDetail> bookDetails;
	
	public long getBookId() {
		return bookId;
	}
	public Book() {}
	public Book(long bookId, String bookName, String bookUrl, List<BookDetail> bookDetails) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookUrl = bookUrl;
		this.bookDetails = bookDetails;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookUrl() {
		return bookUrl;
	}

	public void setBookUrl(String bookUrl) {
		this.bookUrl = bookUrl;
	}



}
