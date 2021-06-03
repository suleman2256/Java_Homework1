package ru.ibs.str.java.homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class Staff {

    public static void main(String[] args) {
        var worker = new Employee("Ишгарин Руслан", 3, "Frontend") {
            private String position;
            private String salary;

            public String getPosition() {
                return position;
            }

            public void setPosition(String position) {
                this.position = position;
            }

            public String getSalary() {
                return salary;
            }

            public void setSalary(String salary) {
                this.salary = salary;
            }

            public void loveGame() {
                System.out.println("Его любимая игра Dota 2!");
            }
        };

        worker.setPosition("Senior developer");
        worker.setSalary("80000");

        HashSet<Employee> employees = new HashSet<>();
        employees.add(new Developer("Руслан Ишгарин", 3, "Frontend"));
        employees.add(new TeamLeader("Азамат Казбулатов", 6, "Backend"));
        employees.add(new Trainee("Мария Семерикова", 11, "DevOps"));
        employees.add(new Trainee("Софья Алёхина", 4, "Frontend"));
        employees.add(new Developer("Юлия Булатова", 8, "Frontend"));
        employees.add(new Trainee("Алия Сираева", 7, "DevOps"));
        employees.add(new Developer("Руслан Гайфуллин", 15, "DevOps"));
        employees.add(new Trainee("Арина Трочина", 14, "Backend"));
        employees.add(new Developer("Розалина Ишманова", 2, "Frontend"));
        employees.add(new TeamLeader("Искандер Ишембетов", 18, "Backend"));

        List<Employee> employeeList = new ArrayList<>(employees);

        long direction = employeeList.stream().filter(employee -> employee.getDirection().equals("Frontend")).count();
                System.out.println("Count Frontend developer = " + direction + "\n");

        employeeList
                .stream()
                .map(employee -> employee.getName()).forEach(System.out::println);

    }
}