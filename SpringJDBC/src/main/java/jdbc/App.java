package jdbc;

import com.sun.security.jgss.GSSUtil;
import jdbc.beans.Student;
import jdbc.dao.StudentDao;
import jdbc.dao.StudentDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
        System.out.println(ctx);

        StudentDao stDao=ctx.getBean("studentDao", StudentDao.class);

        //Insert
        //Student s=new Student(2,"Prena");
        //if(stDao.insert(s))
        //    System.out.println("done");

        //Delete
        //Student s=new Student(1,"Priya");
        //if(stDao.delete(s))
        //    System.out.println("done");

        //Update
        //Student s=new Student(2,"Prerna");
        //if(stDao.update(s))
        //    System.out.println("done");

        //Retrieve-Single
        //Student s=stDao.retrieve(2);
        //System.out.println(s);

        //Retrieve-Multiple
        List<Student> s=stDao.retrieveMulti();
        for(Student st:s)
            System.out.println(st);
    }
}
