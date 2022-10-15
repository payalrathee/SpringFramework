package org.example;

public class Book {
    private int no;
    private String name;

    public Book(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}
