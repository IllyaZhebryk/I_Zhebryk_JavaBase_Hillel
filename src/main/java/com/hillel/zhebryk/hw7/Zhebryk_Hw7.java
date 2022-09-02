package com.hillel.zhebryk.hw7;

import java.util.Scanner;

public class Zhebryk_Hw7 {
    public static void main(String[] args) {
        int quiz;
        Scanner scanner = new Scanner(System.in);
        int x = (int) (Math.random()*11);
        //System.out.println(x); //використовував для тестування, щоб бачити правильний результат.
        for (int i = 0; i < 3; i++) {
            System.out.println("Введіть ціле число від 0 до 10:");
            if (scanner.hasNextInt()) {
                quiz = scanner.nextInt();
                if (quiz >= 0 && quiz <=10) {
                    if (quiz == x) {
                        System.out.println("Вітаємо! Ви вгадали!");
                    } else if (i == 2){
                        System.out.println("На жаль, Ви не вгадали. Хай щастить )");
                    }else {
                        System.out.println("Спробуйте ще раз");
                    }
                } else if (i == 2){
                    System.out.println("На жаль, кількість спроб вичерпано.Наступного разу будьте уважніші!");
                }else {
                    System.out.println("Невірно введене число. Нагадаємо, що потрібно вводити ціле число від 0 до 10.");
                }
            } else {
                System.out.println("Невірний формат введених даних. Введіть ціле число від 0 до 10.");
                scanner.next();
                }
        }
        scanner.close();
    }
}
