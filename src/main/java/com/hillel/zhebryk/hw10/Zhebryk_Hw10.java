package com.hillel.zhebryk.hw10;


public class Zhebryk_Hw10 {
    public static void main(String[] args) {
        int n = 7;
        int min = 0;
        int max = 9;
        int[] lot = new int[n];
        int[] gamer = new int[n];
        for (int i = 0; i < n; i++) {
            lot[i] = (int) (Math.random() * (max - min + 1) + min);
            gamer[i] = (int) (Math.random() * (max - min + 1) + min);
        }
//        System.out.println(Arrays.toString(lot)); це і нижче - просто для візуального контролю
//        System.out.println(Arrays.toString(gamer));
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < lot.length - 1 - i; j++) {
                if (lot[j] > lot[j + 1]) {
                    temp = lot[j];
                    lot[j] = lot[j + 1];
                    lot[j + 1] = temp;
                }
            }
            for (int k = 0; k < gamer.length - 1 - i; k++) {
                if (gamer[k] > gamer[k + 1]) {
                    temp = gamer[k];
                    gamer[k] = gamer[k + 1];
                    gamer[k + 1] = temp;
                }
            }
        }
//        System.out.println(Arrays.toString(lot));
//        System.out.println(Arrays.toString(gamer));
        System.out.print("Співпали такі елементи: ");
        for (int i = 0; i < n; i++) {
            if (lot[i] == gamer[i]) {
                System.out.print("№ " + (i + 1) + " зі значенням " + lot[i] + "; ");
            }
        }
        System.out.print("і все.");
    }
}

