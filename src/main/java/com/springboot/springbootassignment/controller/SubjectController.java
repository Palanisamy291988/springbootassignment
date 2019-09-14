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
import com.springboot.springbootassignment.model.Subject;
import com.springboot.springbootassignment.service.SubjectService;




@Controller
@RequestMapping(value="/spring-boot")
public class SubjectController {

	@Autowired
	SubjectService subjectService;

	// Search a subject

	@RequestMapping({ "/searchSubject" })
	public ModelAndView searchSubject(ModelAndView model) {
		System.out.println("Begin searchSubject in SubjectController");

		model.setViewName("searchSubject");
		model.addObject("isVisible", false);
		return model;

	}

	@RequestMapping({ "/getSubjectById" })
	public ModelAndView getSubjectById(@RequestParam("subjectId") String subjectId, HttpServletRequest request,
			HttpServletResponse response, ModelAndView model) {
		System.out.println("Begin getSubjectById SubjectController");

		System.out.println("BookId in getSubjectById SubjectController: " + subjectId);

		List<Subject> subjectList = subjectService.getSubjectById(Long.parseLong(subjectId));
		System.out.println("getSubjectById subjectList in SubjectController: " + subjectList);
		System.out.println("getSubjectById subjectList size in SubjectController: " + subjectList.size());

		for (Subject subjectDto : subjectList) {
			Book bookDto = subjectDto.getBook();
			subjectDto.getSubjectId();
			subjectDto.getSubtitle();

			System.out.println("SubjectId in getSubjectById: " + subjectDto.getSubjectId() + "SubjectTitle :"
					+ subjectDto.getSubtitle());
			System.out.println("BookId in getSubjectById:" + bookDto.getBookId() + "BookTitle: " + bookDto.getTitle()
					+ "BookPrice: " + bookDto.getPrice());

		}
		// model.addObject("subjectList",subjectList);
		request.setAttribute("subjectList", subjectList);
		model.addObject("isVisible", true);
		model.addObject("subjectId", subjectId);
		model.setViewName("searchSubject");

		return model;

	}

	// Delete Subject

	// Search a subject

	@RequestMapping({ "/deleteSubject" })
	public ModelAndView deleteSubject(ModelAndView model) {
		System.out.println("Begin deleteSubject in SubjectController");

		model.setViewName("deleteSubject");
		model.addObject("isVisible", false);
		return model;

	}

	@RequestMapping({ "/deleteSubjectById" })
	public ModelAndView deleteSubjectById(@RequestParam("subjectId") String subjectId, HttpServletRequest request,
			HttpServletResponse response, ModelAndView model) {
		System.out.println("Begin deleteSubjectById SubjectController");

		System.out.println("BookId in deleteSubjectById SubjectController: " + subjectId);

		subjectService.deleteSubjectById(Long.parseLong(subjectId));

		List<Subject> subjectList = subjectService.getSubjectInfo();
		System.out.println("deleteSubjectById subjectList in SubjectController: " + subjectList.size());

		System.out.println("deleteSubjectById subjectList in SubjectController: " + subjectList);
		// model.addObject("subjectList",subjectList);
		request.setAttribute("subjectList", subjectList);
		model.addObject("isVisible", true);
		model.addObject("subjectId", subjectId);
		model.setViewName("deleteSubject");

		return model;

	}

}
