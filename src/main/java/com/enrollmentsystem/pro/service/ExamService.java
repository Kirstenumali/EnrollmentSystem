package com.enrollmentsystem.pro.service;

import java.util.Scanner;

public class ExamService {

    // odd numbers, 1, 3, 5
    private void oddNumber(int number) {
        for (int i = 3; i < number; i+=2) {
            System.out.println(i);
        }
    }
    // negative number
    private void negativeNumber(int negativeNumber) {
        for (int i = 0; i <= negativeNumber; i++) {
            System.out.println(-i);
        }
    }
    // odd number with 4
    private void oddNumberWithFour(int number) {
       for (int i = 1; i <= number; i++) {
           int j = i % 2;
           if (j == 0) {
           System.out.println("Even number is: " + i);}}}

        // reverse order, 5, 4, 3, 1, 0
    private void reverseNumber(int number) {
        for (int i = number; i >= 0; i--) {
            System.out.println(i);
        }
    }
//    public void inputNumber(int number, int num, int third, int fourth) {
//        System.out.println("Input value=" + number);
//        for (int i = 1; i < num; i++) {
//            System.out.println("*");
//        }
//        System.out.println("Input value=" + third);
//        for (int i = 1; i < fourth; i++) {
//            System.out.println("*");
//        }

      public void inputNumber(int number) {
          System.out.println("Input value=" + number);
          for (int i = 1; i <= number; i++) {
              for (int j = 1; j <= i; j++) {
                  System.out.print("*");
              }
              System.out.println("");
              }
//          for (int i = number - 1; i >= 1; i--) {
//              for (int j = 1; j <= i; j++) {
//                  System.out.print("*");
//              }
//              System.out.println("");
//          }
          }
      }
