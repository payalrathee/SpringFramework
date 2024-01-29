package com.example.springPractice.basic;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("basicConfig.xml");
    	
    	Student s = context.getBean("student1", Student.class);
    	System.out.println(s);
    }
}
