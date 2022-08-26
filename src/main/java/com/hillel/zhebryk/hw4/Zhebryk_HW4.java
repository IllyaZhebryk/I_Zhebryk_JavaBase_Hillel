package com.hillel.zhebryk.hw4;

public class Zhebryk_HW4 {
    public static void main(String[] args) {
        int warLee = 13;
        int archLee = 24;
        int cavLee = 46;
        int warMin = 9;
        int archMin = 35;
        int cavMin = 12;
        int totalLee = 860 * (warLee + archLee + cavLee);
        double totalMin = 1.5 * 860 * (warMin + archMin + cavMin);
        System.out.println("Загальна атакуюча сила дінастії Лі складає " + totalLee);
        System.out.println("Загальна атакуюча сила дінастії Мінь складає " + (int) totalMin );

    }
}
