package com.springboot.springbootassignment.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.springbootassignment.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long>{
	
	
	

}
