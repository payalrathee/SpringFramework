package org.example;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

public class Student {
    private int roll;
    private String name;

    private LinkedHashSet phnNo;

    private List<String> degree;

    private Map<String,Integer> courses;

    private Properties skills;


    public Student(int roll, String name, LinkedHashSet phnNo, List<String> degree, Map<String, Integer> courses, Properties skills) {
        this.roll = roll;
        this.name = name;
        this.phnNo = phnNo;
        this.degree = degree;
        this.courses = courses;
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name=" + name +
                ", phnNo=" + phnNo +
                ", degree=" + degree +
                ", courses=" + courses +
                ", skills=" + skills +
                '}';
    }
}
