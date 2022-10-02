package com.hillel.zhebryk.hw16;

public class Main {
    public static void main(String[] args) {
        Androids android = new Androids("OPPO A5");
        IPhone iPhone = new IPhone("iPhone XX");
        System.out.println("У нас є такий телефон на андроіді " + android.name);
        System.out.println("Ось його властивості:");
        System.out.print("Дзвінок: ");
        android.call();
        System.out.print("СМС: ");
        android.sms();
        System.out.print("І підключення до інтернету: ");
        android.internet();
        System.out.println();
        System.out.println("А ось новинка на iOS: " + iPhone.name);
        System.out.println("Ось що він може:");
        System.out.print("Дзвінок: ");
        iPhone.call();
        System.out.print("СМС: ");
        iPhone.sms();
        System.out.print("І, нарешті, підключення до інтернету: ");
        iPhone.internet();
    }
}
