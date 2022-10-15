package org.example;

public class Office {
    private int no;
    private int floor;

    public Office(int no, int floor) {
        this.no = no;
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Office{" +
                "no=" + no +
                ", floor=" + floor +
                '}';
    }
}
