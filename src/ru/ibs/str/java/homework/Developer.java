package ru.ibs.str.java.homework;

import java.sql.SQLOutput;

public class Developer extends Employee {

    private String gender;
    private String salary;
    private boolean responsible;


    public Developer(String name, int id, String direction) {
        super(name, id, direction);
    }

    public Developer(String gender,String salary, boolean responsible, String name, int id, String direction){
        super(name, id, direction);
        this.gender = gender;
        this.salary = salary;
        this.responsible = responsible;

    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public boolean isResponsible() {
        return responsible;
    }

    public void setResponsible(boolean responsible) {
        this.responsible = responsible;
    }

    public void runProgram() {
        System.out.println("Запускаю приложение");
    }

    public void debag() {
        System.out.println("Исправляю баги");
    }
}


