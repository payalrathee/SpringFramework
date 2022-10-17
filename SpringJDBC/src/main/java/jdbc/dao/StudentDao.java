package jdbc.dao;

import jdbc.beans.Student;

import java.util.List;

public interface StudentDao {
    public boolean insert(Student s);
    public boolean delete(Student s);
    public boolean update(Student s);
    public Student retrieve(int id);
    public List<Student> retrieveMulti();

}
