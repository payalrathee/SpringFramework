package spring.SpringPractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        JdbcTemplate template = ctx.getBean("jdbcTemplate", JdbcTemplate.class);
        template.update("insert into user values(?,?)", 111, "abc");
    }
}
