package p;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
    private int id;
    private String name;
    private Address adr;


    public Employee(int id, String name,Address adr) {
        this.id = id;
        this.name = name;
        this.adr=adr;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", adr=" + adr +
                '}';
    }
}
