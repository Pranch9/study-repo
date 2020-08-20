package com.javalesson.chapter1.task0;


import java.util.Scanner;

public class LoopTask {
    public static void main(String[] args) {
        System.out.println("Введите число итераций для расчета");
        Scanner vvod = new Scanner(System.in);
        if (vvod.hasNextInt()) {
            int value = vvod.nextInt();
            for (int i = 0; i < value; i++) {
                System.out.println("Количество итераций = " + value);
                System.out.println("Итерация № " + (i + 1));
                System.out.println("Введите группу из 3-х чисел" + "\n");
//проверка на корректность ввода данных
                if (vvod.hasNextInt()) {
                    int a = vvod.nextInt();
                    int b = vvod.nextInt();
                    int n = vvod.nextInt();
                    System.out.print("Результат: \n");
                    for (int j = 0; j < n; j++) {
                        int grade = (int) Math.pow(2, j);
                        a = a + grade * b;
                        System.out.print(a + " ");
                    }
                    System.out.println("\n");
                } else if (vvod.hasNextDouble()) {
                    System.out.println("Вы ввели не целое число");
                    System.exit(0);
                } else {
                    System.out.println("Вы ввели не число");
                    System.exit(0);
                }
            }
        } else if (vvod.hasNextDouble()) {
            System.out.println("Вы ввели не целое число");
            System.exit(0);
        } else {
            System.out.println("Вы ввели не число");
            System.exit(0);
        }
    }
}

