package com.javalesson.chapter1.task3;


import java.util.Scanner;

public class PalindromeFinderTask {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите пятизначное число");
        boolean repeatLoop = true;
        while (repeatLoop) {
            int inputNumber = input.nextInt();
            String convertNumber = String.valueOf(inputNumber);
            if (convertNumber.length() != 5) {
                System.out.println("Это не пятизначное число! Попробуйте еще.");
            } else {
                repeatLoop = false;
                StringBuilder reverseNumber = new StringBuilder();
                for (int i = convertNumber.length() - 1; i >= 0; i--) {
                    reverseNumber.append(convertNumber.charAt(i));
                }
                if (inputNumber == Integer.parseInt(reverseNumber.toString())) {
                    System.out.println("Это число палиндром");
                } else {
                    System.out.println("Это число не палиндром");
                }
            }
        }
    }
}

