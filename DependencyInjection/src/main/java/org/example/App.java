package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main(String[] args) {
        AbstractApplicationContext c=new ClassPathXmlApplicationContext("appconfig.xml");
        c.registerShutdownHook();
        Student s1=(Student)c.getBean("s1");
        System.out.println(s1);
        Student s2=c.getBean("s2",Student.class);
        System.out.println(s2);
        Student s3=c.getBean("s3",Student.class);
        System.out.println(s3);
        Student s4=c.getBean("s4",Student.class);
        System.out.println(s4);
        Teacher t=c.getBean("t",Teacher.class);
        System.out.println(t);
    }
}
