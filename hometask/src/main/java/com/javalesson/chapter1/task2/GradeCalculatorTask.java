package com.javalesson.chapter1.task2;

import java.util.Scanner;

public class GradeCalculatorTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Для завершения программы введите отрицательное число или ноль");
        System.out.println("Введите оценки по пятибальной шкале");
        int grade = scanner.nextInt();
        int counter = 0;
        int sum = 0;
        double average;
        while (grade > 0) {
            if (grade <= 5) {
                sum = sum + grade;
                counter++;
                grade = scanner.nextInt();
            } else {
                System.out.println("Не по пятибальной шкале");
                System.exit(0);
            }
        }
        if (counter > 0) {
            average = (double) sum / counter;
            System.out.println("Введено оценок: " + counter);
            System.out.println("Сумма оценок: " + sum);
            System.out.println("Средняя оценка: " + average);
        } else {
            System.out.println("Не верный формат!!");
        }
    }
}
