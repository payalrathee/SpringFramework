package org.example;

public class Building {
    private int no;
    private String name;
    private Room room;
    private Office of;


//    public Building()
//    {
//
//    }
    public Building(int no, String name, Room room, Office of) {
        this.no = no;
        this.name = name;
        this.room=room;
        this.of=of;
    }

//    public void setNo(int no) {
//        this.no = no;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setRoom(Room room1) {
//        this.room1 = room1;
//    }

//    public void setOf(Office of) {
//        this.of = of;
//    }

    @Override
    public String toString() {
        return "Building{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", room=" + room +
                ", of=" + of +
                '}';
    }
}

