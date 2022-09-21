package com.hillel.zhebryk.hw11;

import java.util.Scanner;

public class Zhebryk_Hw11 {
    //    Транспонуйте матрицю M x N. Розміри M та N задаються з консолі.
//    Після введення повинні автоматично створюватися два масиви
//    розміром M x N перший та N x M другий.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = getSize(scanner);
        int n = getSize(scanner);
        int[][] first = new int[m][n];
        int[][] second = new int[n][m];
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[i].length; j++) {
                first[i][j] = (int) (Math.random() * 100);
                System.out.print(first[i][j] + "\t ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[i].length; j++) {
                second[j][i] = first[i][j];
            }
        }
        for (int i = 0; i < second.length; i++) {
            for (int j = 0; j < second[i].length; j++) {
                System.out.print(second[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static int getSize(Scanner scanner) {
        int checkInput = 0;
        System.out.println("Введіть ціле додатне число");
        while (true) {
            if (scanner.hasNextInt()) {
                checkInput = scanner.nextInt();
                if (checkInput >= 0) {
                    break;
                } else {
                    System.out.println("Невірний формат введених даних. Потрібно ввести ціле додатне число, більше ніж 0.");
                }
            } else {
                System.out.println("Невірний формат введених даних. Потрібно ввести ціле додатне число, більше ніж 0.");
                scanner.nextLine();
            }
        }
        return checkInput;
    }

}
