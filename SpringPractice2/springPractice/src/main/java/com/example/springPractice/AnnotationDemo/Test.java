package com.example.springPractice.AnnotationDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.springPractice.basic.Address;
import com.example.springPractice.basic.Student;

public class Test {
	public static void main(String ...args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
//		Student s = context.getBean("student", Student.class);
//		System.out.println(s);
		
		Address adrs = context.getBean("adrs", Address.class);
		System.out.println(adrs);
		
		Address adrs1 = context.getBean("adrs", Address.class);
		System.out.println(adrs1);
		
		
	}

}
