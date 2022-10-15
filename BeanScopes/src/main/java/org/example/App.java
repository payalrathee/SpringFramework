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
        Student s=ctx.getBean("s", Student.class);
        System.out.println(s);
        s=ctx.getBean("s", Student.class);
        System.out.println(s);
    }
}
