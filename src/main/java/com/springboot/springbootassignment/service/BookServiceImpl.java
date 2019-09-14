package com.springboot.springbootassignment.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.springbootassignment.model.Book;
import com.springboot.springbootassignment.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
    private BookRepository bookRepository;

	
	@Override
	public List<Book> getBookById(long bookId) {
		System.out.println("getBookById call start in impl:" + bookId);
		List<Book> bookList1 = null;
		Optional<Book> bookList = bookRepository.findById(bookId);

		if (bookList.isPresent()) {
			Book book1 = bookList.get();

			bookList1 = new ArrayList<Book>();
			bookList1.add(book1);

		}

		return bookList1;

	}
	
	
	@Override
	public List<Book> getAllBooks(){
		List<Book> list = new ArrayList<Book>();
		bookRepository.findAll().forEach(e -> list.add(e));
		
		for(int i=0;i<list.size();i++){
			Book book1 = list.get(i);
			System.out.println("bookName: "+book1.getTitle());
		}
		
		return list;
	}
	
	
	@Override
	public void addBook(Book book) {
		System.out.println("addBook call start in impl");
		// TODO Auto-generated method stub
		bookRepository.save(book);
		System.out.println("book saved");

	}
	
	
	
	@Override
	public void deleteBook(long bookId) {
		bookRepository.deleteById(bookId);
	}
		
		
	

}
