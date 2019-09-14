package com.springboot.springbootassignment.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.springbootassignment.model.Book;
import com.springboot.springbootassignment.service.BookService;




@Controller
@RequestMapping(value="/spring-boot")
public class BookController {
	
	@Autowired
    BookService bookService;
	
	//Add a Book
	
	@RequestMapping({ "/addBook" })
	public ModelAndView addBook(ModelAndView model) {
		System.out.println("Begin addBook in MenuController");
		
		model.setViewName("addBook");
		
		return model;							
			
	}	
	
	@RequestMapping(value = "/addBookInfo")
	public ModelAndView addBookInfo(@RequestParam("bookId") String bookId,@RequestParam("title") String title,
			@RequestParam("price") String price,@RequestParam("volume") String volume,@RequestParam("publishDate") String publishDate,
			HttpServletRequest request, HttpServletResponse response, ModelAndView model) {
		System.out.println("Start addBookInfo in BookController");
		
		Book book = new Book();
		book.setBookId(Long.parseLong(bookId));
		book.setTitle(title);
		book.setPrice(Double.valueOf(price));
		book.setVolume(Integer.parseInt(volume));
		book.setPublishDate(publishDate);
		bookService.addBook(book);
		
		
		List<Book> bookList = bookService.getAllBooks();
		System.out.println("addBookInfo bookList in BookController: "+bookList.size());
		
		model.addObject("bookList",bookList);
		model.setViewName("addBook");
		
		System.out.println("End addBookInfo in BookController");
		return model;					
		
		
	}
	
	//Delete a Book
	@RequestMapping({ "/deleteBook" })
	public ModelAndView deleteBook(ModelAndView model) {
		System.out.println("Begin deleteBook in MenuController");
		
		model.addObject("isVisible", false);
		model.setViewName("deleteBook");
		
		return model;							
			
	}	
	
		@RequestMapping({ "/deleteBookInfo" })
			public ModelAndView deleteBookInfo(@RequestParam("bookId") String bookId,HttpServletRequest request, HttpServletResponse response, ModelAndView model) {
				System.out.println("Begin OtherContactController getPharmacyList() ");
				
				System.out.println("BookId in deleteBookInfo MenuController: "+bookId);
				bookService.deleteBook(Long.parseLong(bookId));
			
				
				List<Book> bookList = bookService.getAllBooks();
				System.out.println("deleteBookInfo bookList in BookController: "+bookList.size());
				model.addObject("bookList",bookList);
				model.addObject("isVisible", true);
				model.addObject("bookId", bookId);
				model.setViewName("deleteBook");
				
				return model;							
					
			}		
	
	//getBookById (Search a Book)
		
		@RequestMapping({ "/getBookInfoId" })
		public ModelAndView getBookInfo(ModelAndView model) {
			System.out.println("Begin getBookInfo in BookController");
			
			model.setViewName("getBookById");
			model.addObject("isVisible", false);
			return model;							
				
		}			
	
		@RequestMapping({ "/getBookInfoById" })
		public ModelAndView getBookInfoById(@RequestParam("bookId") String bookId,HttpServletRequest request, HttpServletResponse response, ModelAndView model) {
			System.out.println("Begin getBookInfoById BookController");
			
			System.out.println("BookId in getBookInfoById Bookcontroller: "+bookId);
			List<Book> bookList = bookService.getBookById(Long.parseLong(bookId));
			
			System.out.println("getBookInfoById bookList in BookController: "+bookList);
			model.addObject("bookList",bookList);
			model.addObject("isVisible", true);
			model.addObject("bookId", bookId);
			model.setViewName("getBookById");
			
			return model;							
				
		}				
		
	
	//getAllBookInfo
	
	@RequestMapping(value = "/getBookInfo")
	public String getBookInfo() {
		System.out.println("Start getBookInfo in BookController");
		
		
		List<Book> bookList = bookService.getAllBooks();
		System.out.println("bookList in BookController: "+bookList.size());
		
		for (Book book : bookList) {
	         System.out.println("BookTitle in BookController: " + book.getTitle());
	     }
		
		System.out.println("End getBookInfo in BookController");
		
		return "home";
		
	}
	
	
	
	
	

}
