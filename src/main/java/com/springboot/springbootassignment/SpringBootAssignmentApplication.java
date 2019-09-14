package com.springboot.springbootassignment;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringBootAssignmentApplication implements CommandLineRunner{
	


	public static void main(String[] args) {
		SpringApplication.run(SpringBootAssignmentApplication.class, args);
	}
	
	@Override
	public void run(String... arg0) throws Exception {
		

		System.out.println("End - SpringBootAssignmentApplication run method.");

	}

}
