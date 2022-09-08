package com.hillel.zhebryk.hw9;


public class Zhebryk_Hw9 {
    public static void main(String[] args) {
        int[] team1 = new int[25];
        int[] team2 = new int[25];
        int ageTotal1 = 0;
        int ageTotal2 = 0;
        System.out.print("Перша команда має гравців такого віку: ");
        for (int i = 0; i < team1.length; i++) {
            team1[i] = (int) (Math.random() * 23 + 18);
            ageTotal1 += team1[i];
            if (i < team1.length - 1) {
                System.out.print(team1[i] + ", ");
            } else {
                System.out.println("та " + team1[i] + " років.");
            }
        }
        System.out.print("Друга команда має гравців такого віку: ");
        for (int i = 0; i < team2.length; i++) {
            team2[i] = (int) (Math.random() * 23 + 18);
            ageTotal2 += team2[i];
            if (i < team2.length - 1) {
                System.out.print(team2[i] + ", ");
            } else {
                System.out.println("та " + team2[i] + " років.");
            }
        }
        System.out.println();
        System.out.println("Середній вік першої команди складає " + (ageTotal1 / team1.length) + " років.");
        System.out.println("Середній вік другої команди складає " + (ageTotal2 / team2.length) + " років.");
    }
}
