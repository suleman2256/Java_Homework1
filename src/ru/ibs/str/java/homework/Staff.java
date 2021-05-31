package ru.ibs.str.java.homework;

import java.util.ArrayList;
import java.util.HashSet;

public class Staff {
    public static void main(String[] args) {
        HashSet<Employee> employees = new HashSet<>();
        employees.add(new Developer("Ишгарин Руслан", 3, "Frontend"));
        employees.add(new TeamLeader("Казбулатов Азамат", 6, "Backend"));
        employees.add(new Trainee("Мария Семерикова", 11, "DevOps"));

        ArrayList<Employee> employeeArrayList = new ArrayList<>(employees);
    }
}
