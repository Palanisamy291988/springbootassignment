package com.springboot.springbootassignment.service;

import java.util.List;

import com.springboot.springbootassignment.model.Book;

public interface BookService {
	
	public List<Book> getBookById(long bookId);
	
	public void addBook(Book book);

	public List<Book> getAllBooks();

	void deleteBook(long bookId);

}
