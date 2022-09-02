package com.hillel.zhebryk.hw8;


public class Zhebryk_Hw8 {
    public static void main(String[] args) {
        int q = 100;
        int count = 0;
            for (int i = 1;; i++) {
                if ((i / 10 == 4) || (i / 10 == 9) || (i % 10 == 4) || (i % 10 == 9) || (i % 100 / 10 == 4) || (i % 100 / 10 == 9) || (i / 100 == 4) || (i / 100 == 9)) {
                    continue;
                }else if (count < q) {
                    System.out.println(i);
                    count++;
                }else break;
            }
        System.out.println("Пронумеровано " + count + " спейс-шатлів. Будуйте ще!");
    }
}
