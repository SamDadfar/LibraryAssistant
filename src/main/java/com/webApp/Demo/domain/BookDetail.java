package com.webApp.Demo.domain;

import javax.persistence.*;

@Entity(name="BookDetails")
@Table(name="book_details")
public class BookDetail {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="book_detail_id")
private long bookDetailId;
@Column(name="isbn")
private long isbn;
public long getBookDetailId() {
	return bookDetailId;
}
public void setBookDetailId(long bookDetailId) {
	this.bookDetailId = bookDetailId;
}

public long getIsbn() {
	return isbn;
}
public void setIsbn(long isbn) {
	this.isbn = isbn;
}

}
