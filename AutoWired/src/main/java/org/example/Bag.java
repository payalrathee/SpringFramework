package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class Bag {
    private String color;
    private Book book;

    @Autowired
    public Bag(String color, Book book) {
        this.color = color;
        this.book = book;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Bag{" +
                "color='" + color + '\'' +
                ", book=" + book +
                '}';
    }
}
