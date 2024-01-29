package com.example.springPractice.AnnotationDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.springPractice.basic.Address;
import com.example.springPractice.basic.Student;

@Configuration
public class Config {
	
	@Bean
	public Student student() {
		return new Student();
	}
	
	@Bean
	public Address adrs() {
		return new Address(101, "abc");
	}
}
