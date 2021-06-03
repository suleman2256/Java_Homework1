package ru.ibs.str.java.homework;

public class Trainee extends Employee{

    private boolean diploma;
    private int age;
    private String programminglanguage;

    public Trainee(String name, int id, String direction) {
        super(name, id, direction);
    }

    public Trainee(boolean diploma, int age, String programminglanguage, String name, int id, String direction) {
        super(name, id, direction);
        this.diploma = diploma;
        this.age = age;
        this.programminglanguage = programminglanguage;
    }

    public boolean getDiploma() {
        return diploma;
    }

    public boolean isDiploma() {
        return diploma;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProgramminglanguage() {
        return programminglanguage;
    }

    public void setProgramminglanguage(String programminglanguage) {
        this.programminglanguage = programminglanguage;
    }

    public void development () {
        System.out.println("Практика, практика и ещё раз практика...");
    }

    public void debag (){
        System.out.println("Опять ошибки...");
    }
}

