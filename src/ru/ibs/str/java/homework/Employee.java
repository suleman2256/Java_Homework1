package ru.ibs.str.java.homework;

public abstract class Employee {
    private String name;
    private int id;
    private String direction;

    public Employee(String name, int id, String direction) {
        this.name = name;
        this.id = id;
        this.direction = direction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
