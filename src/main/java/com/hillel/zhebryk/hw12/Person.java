package com.hillel.zhebryk.hw12;

public class Person {
    //Спробував двома варіантами зробити строку.
    static void personInfo(String name, String surname, String city, String number) {
        System.out.println("Зателефонувати п." + name + " " + surname + " з міста "
                + city + " можна за номером " + number + ".");
    }

    static StringBuilder personInfo1(String name, String surname, String city, String number) {
        StringBuilder stringBuilder = new StringBuilder("Зателефонувати п. ");
        stringBuilder
                .append(name)
                .append(" ")
                .append(surname)
                .append(" з міста ")
                .append(city)
                .append(" можна за номером ")
                .append(number)
                .append(".");
        return stringBuilder;
    }

    public static void main(String[] args) {

        System.out.print("a. ");
        personInfo("John", "Lennon", "Liverpool", "+1704567");
        System.out.println("b. " + personInfo1("Alexandre", "Doumaunt", "Paris", "+44569076"));
        System.out.println("c. " + personInfo1("Іван", "Айвазовський", "Феодосія", "+380675556789"));

    }

}


