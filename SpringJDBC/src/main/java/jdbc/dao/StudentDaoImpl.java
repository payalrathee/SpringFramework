package jdbc.dao;

import jdbc.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.annotation.PostConstruct;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class StudentDaoImpl implements StudentDao{
    private JdbcTemplate template;

    public StudentDaoImpl(JdbcTemplate template)
    {
        this.template=template;
    }
    public boolean insert(Student s) {
        String query="insert into student values(?,?);";
        int r=template.update(query,s.getId(),s.getName());
        if(r>0)
            return true;
        return false;
    }

    public boolean delete(Student s) {
        String query="delete from student where id=?";
        int r=template.update(query,s.getId());
        if(r>0)
            return true;
        return false;
    }

    public boolean update(Student s) {
        String query="update student set name=? where id=?";
        int r=template.update(query,s.getName(),s.getId());
        if(r>0)
            return true;
        return false;
    }

    public Student retrieve(int id) {
        String query="select * from student where id=?;";
        Student s=template.queryForObject(query, new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet resultSet, int i) throws SQLException {
                Student s=null;
                s = new Student(resultSet.getInt(1), resultSet.getString(2));
                return s;
            }
        },id);
        return s;
    }

    public List<Student> retrieveMulti() {
        String query="select * from student;";
        List<Student> s=template.query(query, new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet resultSet, int i) throws SQLException {
                Student s=null;
                s = new Student(resultSet.getInt(1), resultSet.getString(2));
                return s;
            }
        });
        return s;
    }
}
