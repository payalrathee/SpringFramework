package org.example;

public class Room {
    private int no;
    private int floor;

    public Room(int no, int floor) {
        this.no = no;
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Room{" +
                "no=" + no +
                ", floor=" + floor +
                '}';
    }
}
