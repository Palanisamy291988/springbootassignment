package com.springboot.springbootassignment.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.springbootassignment.model.Subject;

@Repository
public interface SubjectRepository extends CrudRepository<Subject, Long>{

}
