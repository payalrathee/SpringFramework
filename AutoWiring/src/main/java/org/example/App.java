package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import p.Bag;
import p.Book;

public class App
{
    public static void main( String[] args )
    {
//        ApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
//        Room r= ctx.getBean("room", Room.class);
//        System.out.println(r);
//        Building b1=ctx.getBean("b2", Building.class);
//        System.out.println(b1);
//        Object o=ctx.getBean("o");
//        System.out.println(o);

        ApplicationContext ctx1=new ClassPathXmlApplicationContext("config1.xml");
        Bag bag=ctx1.getBean("bag", Bag.class);
        System.out.println(bag);
        Book b=ctx1.getBean("book1",Book.class);
    }
}
