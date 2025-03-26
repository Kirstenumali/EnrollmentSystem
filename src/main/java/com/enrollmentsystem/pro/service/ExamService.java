package com.enrollmentsystem.pro.service;

import java.util.ArrayList;
import java.util.Scanner;

public class ExamService {

    private void oddNumber(int number) {
        for (int i = 3; i < number; i+=2) {
            System.out.println(i);
        }
    }
    private void negativeNumber(int negativeNumber) {
        for (int i = 0; i <= negativeNumber; i++) {
            System.out.println(-i);
        }
    }
    private void oddNumberWithFour(int number) {
       for (int i = 1; i <= number; i++) {
           int j = i % 2;
           if (j == 0) {
           System.out.println("Even number is: " + i);}}}

    private void reverseNumber(int number) {
        for (int i = number; i >= 0; i--) {
            System.out.println(i);
        }
    }

      public void inputNumber(int number) {
          System.out.println("Input value=" + number);
          for (int i = 1; i <= number; i++) {
              for (int j = 1; j <= i; j++) {
                  System.out.print("*");
              }
              System.out.println("");
          }
      }

      public void printNumbers() {
          ArrayList<Integer> myNumbers = new ArrayList<>();
          myNumbers.add(Integer.valueOf("1"));
          myNumbers.add(Integer.valueOf("3"));
          myNumbers.add(Integer.valueOf("5"));

          System.out.println("this is the numbers");
          for (int number: myNumbers);
          System.out.println(myNumbers);
      }
      }
