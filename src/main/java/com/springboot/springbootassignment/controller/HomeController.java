package com.springboot.springbootassignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/spring-boot")
public class HomeController {
	
/*	@RequestMapping(value="/home", method=RequestMethod.GET) 
	public ModelAndView home() {
		System.out.println("Start home in HomeController");
		ModelAndView model = new ModelAndView();
		model.setViewName("home");
		
		System.out.println("End home in HomeController");
		return model;
	}*/
	
	@RequestMapping({ "/home" })
	public ModelAndView home(ModelAndView model) {
		System.out.println("Begin home in HomeController");
		
		model.setViewName("home");
		
		return model;							
			
	}	
	
	/*@RequestMapping(value="/exit", method=RequestMethod.GET) 
	public ModelAndView exit() {
		System.out.println("Start exit in HomeController");
		ModelAndView model = new ModelAndView();
		model.setViewName("exit");
		
		System.out.println("End exit in HomeController");
		return model;
	}*/
	
	
	@RequestMapping({ "/exit" })
	public ModelAndView exit(ModelAndView model) {
		System.out.println("Begin addBook in MenuController");
		
		model.setViewName("exit");
		
		return model;							
			
	}	

}
