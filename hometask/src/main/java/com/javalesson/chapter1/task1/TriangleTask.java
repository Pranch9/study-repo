package com.javalesson.chapter1.task1;

import java.util.Scanner;

public class TriangleTask {
    public static void main(String[] args) {
        System.out.println("Введите значения сторон треугольника: \n");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            if (a > b + c) {
                errorText();
            } else if (b > a + c) {
                errorText();
            } else if (c > a + b) {
                errorText();
            } else {
                System.out.println("Веденные значения могут быть сторонами треугольника значения");
            }
        } else if (scanner.hasNextDouble()) {
            System.out.println("Это не целое число!");
        } else {
            System.out.println("Это не число!");
        }
    }

    static void errorText() {
        System.out.println("С такими значениями сторон нельзя составить треугольник");
    }
}
