package org.example;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Teacher {
    private int id;
    private String name;

    public Teacher(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @PostConstruct
    public void init()
    {
        System.out.println("Init teacher");
    }
    @PreDestroy
    public void destroy()
    {
        System.out.println("Destroy teacher");
    }
}
