package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");

        Object o1=ctx.getBean("phnNo");
        System.out.println(o1.getClass().getName());
        System.out.println(o1);

        Student s=ctx.getBean("ss",Student.class);
        System.out.println(s);

    }
}
