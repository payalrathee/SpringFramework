package org.example;
import java.util.ArrayList;

public class Student
{
    private int id;
    private String name;
    private Address address;
    private ArrayList<String> courses=new ArrayList<>();

    public Student() {
        System.out.println("defualt construction...");
    }

    public Student(int id, String name,Address address,ArrayList<String> courses) {
        System.out.println("constructing...");
        this.id = id;
        this.name = name;
        this.address=address;
        this.courses=courses;
    }

    public void setId(int id) {
        System.out.println("setting id...");
        this.id = id;
    }

    public void setName(String name) {
        System.out.println("setting name...");
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", courses=" + courses +
                '}';
    }

    public void init()
    {
        System.out.println("initializing");
    }
    public void destroy()
    {
        System.out.println("Destroying");
    }
}
