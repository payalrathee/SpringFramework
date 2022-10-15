package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import p.Employee;
import p.Teacher;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        ApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
//        Student s=ctx.getBean("s", Student.class);
//        System.out.println(s);

        ApplicationContext ctx1=new AnnotationConfigApplicationContext("p");
        //Teacher t=ctx1.getBean("teacher", Teacher.class);
        //System.out.println(t);
        Employee e=ctx1.getBean("emp", Employee.class);
        System.out.println(e);
    }
}
