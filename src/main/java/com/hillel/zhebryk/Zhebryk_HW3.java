package com.hillel.zhebryk;

import java.util.Scanner;

public class Zhebryk_HW3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //я трохи, мабуть, забігаю вперед, але я це колись вивчав і мені здалося вірним задіяти.
        int longiness, high, wigth;
        System.out.println("Введіть длину паралелепіпеда в см");
        longiness = scanner.nextInt();
        System.out.println("Введіть висоту паралелепіпеда в см");
        high = scanner.nextInt();
        System.out.println("Введіть ширину паралелепіпеда в см");
        wigth = scanner.nextInt();
        int volume = longiness * high * wigth;
        int Perimetr = 4 * (longiness + high + wigth);
        System.out.println("Об'єм паралелепіпеду зі сторонами " + longiness +" см, " + high + " см, " + wigth+ " см складає " + volume +" куб.см.");
        System.out.println("Загальна довжина всіх сторін цього ж паралелепіпеду складає " + Perimetr + " см");
    }
}
