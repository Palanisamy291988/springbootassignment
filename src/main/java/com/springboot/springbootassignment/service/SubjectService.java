package com.springboot.springbootassignment.service;

import java.util.List;

import com.springboot.springbootassignment.model.Subject;

public interface SubjectService {

	List<Subject> getSubjectById(long parseLong);

	List<Subject> getSubjectInfo();

	void deleteSubjectById(long parseLong);

}
