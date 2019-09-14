package com.springboot.springbootassignment.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.springbootassignment.model.Book;
import com.springboot.springbootassignment.model.Subject;
import com.springboot.springbootassignment.repository.SubjectRepository;

@Service
public class SubjectServiceImpl implements SubjectService{
	
	@Autowired
    private SubjectRepository subjectRepository;

	@Override
	public List<Subject> getSubjectById(long subjectId) {
		// TODO Auto-generated method stub
		
		List<Subject> subjectList1 = null;
		Optional<Subject> subjectList = subjectRepository.findById(subjectId);
		
		if (subjectList.isPresent()) {
			Subject subject1 = subjectList.get();

			subjectList1 = new ArrayList<Subject>();
			subjectList1.add(subject1);

		}
		return subjectList1;
	}

	@Override
	public List<Subject> getSubjectInfo() {
		List<Subject> list = new ArrayList<Subject>();
		subjectRepository.findAll().forEach(e -> list.add(e));
		
		for(int i=0;i<list.size();i++){
			Subject subject1 = list.get(i);
			System.out.println("subjectName: "+subject1.getSubtitle());
		}
		
		return list;
	}

	@Override
	public void deleteSubjectById(long subjectId) {
		subjectRepository.deleteById(subjectId);
		
	}

}
