package com.enrollmentsystem.pro.service;

public class ExamService {

    // odd numbers, 1, 3, 5
    public void oddNumber(int number) {
        for (int i = 3; i < number; i+=2) {
            System.out.println(i);
        }
    }
    // negative number
    public void negativeNumber(int negativeNumber) {
        for (int i = 0; i <= negativeNumber; i++) {
            System.out.println(-i);
        }
    }
    // odd number with 4
    public void oddNumberWithFour(int number) {
       for (int i = 1; i <= number; i++) {
           int j = i % 2;
           if (j == 0) {
           System.out.println("Even number is: " + i);
           }
       }
        }

        // reverse order, 5, 4, 3, 1, 0
    public void reverseNumber(int number) {
        for (int i = number; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
