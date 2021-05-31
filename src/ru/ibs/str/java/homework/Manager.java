package ru.ibs.str.java.homework;

public interface Manager {
    public default void motivation(){
        System.out.println("Выпишу премию");
    }
}
