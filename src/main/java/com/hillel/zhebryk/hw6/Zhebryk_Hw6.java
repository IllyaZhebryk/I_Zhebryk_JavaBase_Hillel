package com.hillel.zhebryk.hw6;

import java.util.Scanner;

public class Zhebryk_Hw6 {
    public static void main(String[] args) {
        String team1;
        String team2;
        int fragPlayer1_1 = 1;
        int fragPlayer1_2 = 1;
        int fragPlayer1_3 = 1;
        int fragPlayer1_4 = 1;
        int fragPlayer1_5 = 1;
        int fragPlayer2_1 = 1;
        int fragPlayer2_2 = 1;
        int fragPlayer2_3 = 1;
        int fragPlayer2_4 = 1;
        int fragPlayer2_5 = 1;
        int checkInput = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть назву команди 1:");
        team1 = scanner.nextLine();
        System.out.println("Введіть кількість фрагів гравця 1 команди " + team1);
        if (scanner.hasNextInt()) {
            checkInput = scanner.nextInt();
        }else {
            System.out.println("Невірний формат введених даних. Потрібно ввести ціле додатне число або 0. Почніть спочатку і не помиляйтесь.");
            System.exit(0);
        }
        if (checkInput >= 0) { //Денисе, чи можна цю перевірку якось зробити одразу після вводу, разом з перевіркою на цілочисельність?
            //я писав так:
            // if (scanner.hasNextInt() && scanner.nextInt() >=0) {
            //            fragPlayer1_1 = scanner.nextInt();
            //            System.out.println("Зафіксовано таку кількість фрагів гравця 1: " + fragPlayer1_1);
            //        }else {
            //            System.out.println("Невірний формат введених даних. Потрібно ввести ціле додатне число або 0. Почніть спочатку і не помиляйтесь.");
            //            System.exit(0);
            //        }
            // але це не спрацювало - при вводі 0 програма не переходила на наступний крок.
           fragPlayer1_1 = checkInput;
           System.out.println("Зафіксовано таку кількість фрагів гравця 1: " + fragPlayer1_1);
        } else {
            System.out.println("Невірний формат введених даних. Потрібно ввести ціле додатне число або 0. Почніть спочатку і не помиляйтесь.");
            System.exit(0);
        }
        System.out.println("Введіть кількість фрагів гравця 2 команди " + team1);
        if (scanner.hasNextInt()) {
            checkInput = scanner.nextInt();
        }else {
            System.out.println("Невірний формат введених даних. Потрібно ввести ціле додатне число або 0. Почніть спочатку і не помиляйтесь.");
            System.exit(0);
        }
        if (checkInput >= 0) {
            fragPlayer1_2 = checkInput;
            System.out.println("Зафіксовано таку кількість фрагів гравця 2: " + fragPlayer1_2);
        } else {
            System.out.println("Невірний формат введених даних. Потрібно ввести ціле додатне число або 0. Почніть спочатку і не помиляйтесь.");
            System.exit(0);
        }
        System.out.println("Введіть кількість фрагів гравця 3 команди " + team1);
        if (scanner.hasNextInt()) {
            checkInput = scanner.nextInt();
        }else {
            System.out.println("Невірний формат введених даних. Потрібно ввести ціле додатне число або 0. Почніть спочатку і не помиляйтесь.");
            System.exit(0);
        }
        if (checkInput >= 0) {
            fragPlayer1_3 = checkInput;
            System.out.println("Зафіксовано таку кількість фрагів гравця 3: " + fragPlayer1_3);
        } else {
            System.out.println("Невірний формат введених даних. Потрібно ввести ціле додатне число або 0. Почніть спочатку і не помиляйтесь.");
            System.exit(0);
        }
        System.out.println("Введіть кількість фрагів гравця 4 команди " + team1);
        if (scanner.hasNextInt()) {
            checkInput = scanner.nextInt();
        }else {
            System.out.println("Невірний формат введених даних. Потрібно ввести ціле додатне число або 0. Почніть спочатку і не помиляйтесь.");
            System.exit(0);
        }
        if (checkInput >= 0) {
            fragPlayer1_4 = checkInput;
            System.out.println("Зафіксовано таку кількість фрагів гравця 4: " + fragPlayer1_4);
        } else {
            System.out.println("Невірний формат введених даних. Потрібно ввести ціле додатне число або 0. Почніть спочатку і не помиляйтесь.");
            System.exit(0);
        }
        System.out.println("Введіть кількість фрагів гравця 5 команди " + team1);
        if (scanner.hasNextInt()) {
            checkInput = scanner.nextInt();
        }else {
            System.out.println("Невірний формат введених даних. Потрібно ввести ціле додатне число або 0. Почніть спочатку і не помиляйтесь.");
            System.exit(0);
        }
        if (checkInput >= 0) {
            fragPlayer1_5 = checkInput;
            System.out.println("Зафіксовано таку кількість фрагів гравця 5: " + fragPlayer1_5);
        } else {
            System.out.println("Невірний формат введених даних. Потрібно ввести ціле додатне число або 0. Почніть спочатку і не помиляйтесь.");
            System.exit(0);
        }
        scanner.nextLine();
        System.out.println("Введіть назву команди 2:");
        team2 = scanner.nextLine();
        System.out.println("Введіть кількість фрагів гравця 1 команди " + team2);
        if (scanner.hasNextInt()) {
            checkInput = scanner.nextInt();
        }else {
            System.out.println("Невірний формат введених даних. Потрібно ввести ціле додатне число або 0. Почніть спочатку і не помиляйтесь.");
            System.exit(0);
        }
        if (checkInput >= 0) {
            fragPlayer2_1 = checkInput;
            System.out.println("Зафіксовано таку кількість фрагів гравця 1: " + fragPlayer2_1);
        } else {
            System.out.println("Невірний формат введених даних. Потрібно ввести ціле додатне число або 0. Почніть спочатку і не помиляйтесь.");
            System.exit(0);
        }
        System.out.println("Введіть кількість фрагів гравця 2 команди " + team2);
        if (scanner.hasNextInt()) {
            checkInput = scanner.nextInt();
        }else {
            System.out.println("Невірний формат введених даних. Потрібно ввести ціле додатне число або 0. Почніть спочатку і не помиляйтесь.");
            System.exit(0);
        }
        if (checkInput >= 0) {
            fragPlayer2_2 = checkInput;
            System.out.println("Зафіксовано таку кількість фрагів гравця 2: " + fragPlayer2_2);
        } else {
            System.out.println("Невірний формат введених даних. Потрібно ввести ціле додатне число або 0. Почніть спочатку і не помиляйтесь.");
            System.exit(0);
        }
        System.out.println("Введіть кількість фрагів гравця 3 команди " + team2);
        if (scanner.hasNextInt()) {
            checkInput = scanner.nextInt();
        }else {
            System.out.println("Невірний формат введених даних. Потрібно ввести ціле додатне число або 0. Почніть спочатку і не помиляйтесь.");
            System.exit(0);
        }
        if (checkInput >= 0) {
            fragPlayer2_3 = checkInput;
            System.out.println("Зафіксовано таку кількість фрагів гравця 3: " + fragPlayer2_3);
        } else {
            System.out.println("Невірний формат введених даних. Потрібно ввести ціле додатне число або 0. Почніть спочатку і не помиляйтесь.");
            System.exit(0);
        }
        System.out.println("Введіть кількість фрагів гравця 4 команди " + team2);
        if (scanner.hasNextInt()) {
            checkInput = scanner.nextInt();
        }else {
            System.out.println("Невірний формат введених даних. Потрібно ввести ціле додатне число або 0. Почніть спочатку і не помиляйтесь.");
            System.exit(0);
        }
        if (checkInput >= 0) {
            fragPlayer2_4 = checkInput;
            System.out.println("Зафіксовано таку кількість фрагів гравця 4: " + fragPlayer2_4);
        } else {
            System.out.println("Невірний формат введених даних. Потрібно ввести ціле додатне число або 0. Почніть спочатку і не помиляйтесь.");
            System.exit(0);
        }
        System.out.println("Введіть кількість фрагів гравця 5 команди " + team2);
        if (scanner.hasNextInt()) {
            checkInput = scanner.nextInt();
        }else {
            System.out.println("Невірний формат введених даних. Потрібно ввести ціле додатне число або 0. Почніть спочатку і не помиляйтесь.");
            System.exit(0);
        }
        if (checkInput >= 0) {
            fragPlayer2_5 = checkInput;
            System.out.println("Зафіксовано таку кількість фрагів гравця 5: " + fragPlayer2_5);
        } else {
            System.out.println("Невірний формат введених даних. Потрібно ввести ціле додатне число або 0. Почніть спочатку і не помиляйтесь.");
            System.exit(0);
        }
        scanner.close();
        double result1 = (((double)(fragPlayer1_1+fragPlayer1_2+fragPlayer1_3+fragPlayer1_4+fragPlayer1_5))/5);
        double result2 = (((double)(fragPlayer2_1+fragPlayer2_2+fragPlayer2_3+fragPlayer2_4+fragPlayer2_5))/5);
        System.out.println("Середній показник фрагів команди " + team1 + " дорівнює " + result1 + " очок.");
        System.out.println("Середній показник фрагів команди " + team2 + " дорівнює " + result2 + " очок.");
        if (result1 > result2) {
            System.out.println("Отже, перемогла команда " + team1 + " з результатом " + result1 + " очок.");
        }else if (result1 < result2) {
            System.out.println("Отже, перемогла команда " + team2 + " з результатом " + result2 + " очок.");
        }else System.out.println("Бойова нічия");

    }
}
