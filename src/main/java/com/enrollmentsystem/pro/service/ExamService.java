package com.enrollmentsystem.pro.service;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ExamService {

    private void oddNumber(int number) {
        for (int i = 3; i < number; i += 2) {
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
                System.out.println("Even number is: " + i);
            }
        }
    }

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
        myNumbers.add(5);
        myNumbers.add(-1);
        myNumbers.add(5);
        myNumbers.add(100);
        myNumbers.add(-4);
        myNumbers.add(6);
        myNumbers.add(7);
        myNumbers.add(8);
        myNumbers.add(9);
        myNumbers.add(1000);
        myNumbers.add(11);
        myNumbers.add(12);
        myNumbers.add(13);
        myNumbers.add(15);
        myNumbers.add(16);
        myNumbers.add(17);
        myNumbers.add(18);
        myNumbers.add(19);
        myNumbers.add(20);
        myNumbers.add(21);
        myNumbers.add(22);
        myNumbers.add(23);
        myNumbers.add(24);
        myNumbers.add(25);
        myNumbers.add(24);
        myNumbers.add(26);
        myNumbers.add(27);
        myNumbers.add(28);
        myNumbers.add(29);
        myNumbers.add(30);
        myNumbers.add(31);
        myNumbers.add(32);
        myNumbers.add(33);
        myNumbers.add(34);
        myNumbers.add(35);
        myNumbers.add(36);
        myNumbers.add(37);
        myNumbers.add(38);
        myNumbers.add(39);
        myNumbers.add(40);
        myNumbers.add(41);
        myNumbers.add(42);
        myNumbers.add(43);
        myNumbers.add(44);
        myNumbers.add(45);
        myNumbers.add(46);
        myNumbers.add(47);
        myNumbers.add(48);
        myNumbers.add(49);
        myNumbers.add(50);
        myNumbers.add(51);
        myNumbers.add(52);
        myNumbers.add(53);
        myNumbers.add(54);
        myNumbers.add(55);
        myNumbers.add(56);
        myNumbers.add(57);
        myNumbers.add(58);
        myNumbers.add(59);
        myNumbers.add(1400);
        myNumbers.add(62);
        myNumbers.add(63);
        myNumbers.add(64);
        myNumbers.add(65);
        myNumbers.add(66);
        myNumbers.add(67);
        myNumbers.add(68);
        myNumbers.add(69);
        myNumbers.add(70);
        myNumbers.add(71);
        myNumbers.add(72);
        myNumbers.add(73);
        myNumbers.add(74);
        myNumbers.add(75);
        myNumbers.add(76);
        myNumbers.add(78);
        myNumbers.add(39);
        myNumbers.add(80);
        myNumbers.add(81);
        myNumbers.add(82);
        myNumbers.add(83);
        myNumbers.add(84);
        myNumbers.add(85);
        myNumbers.add(86);
        myNumbers.add(87);
        myNumbers.add(88);
        myNumbers.add(89);
        myNumbers.add(90);
        myNumbers.add(91);
        myNumbers.add(92);
        myNumbers.add(93);
        myNumbers.add(94);
        myNumbers.add(95);
        myNumbers.add(96);
        myNumbers.add(97);
        myNumbers.add(98);
        myNumbers.add(99);
        myNumbers.add(101);
        myNumbers.add(103);
        myNumbers.add(1300);

        int maxNumber = myNumbers.get(0);
        int minimumNumber = myNumbers.get(0);

        for (int counter = 0; counter < myNumbers.size(); counter++) {
            System.out.println(myNumbers.get(counter));
        }
        for (int index = 1; index < myNumbers.size(); index++) {
            if (minimumNumber > myNumbers.get(index)) {
                minimumNumber = myNumbers.get(index);
            }
        }
        for (int index = 1; index < myNumbers.size(); index++) {
            if (maxNumber < myNumbers.get(index)) {
                maxNumber = myNumbers.get(index);
            }
        }
        System.out.println("Minimum number is: " + minimumNumber);
        System.out.println("Maximum number is: " + maxNumber);
    }

    public void plusNumbers() {
        System.out.println("Please enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        int sum = 0;
        int index = 0;
        while (index <= inputNumber) {
            System.out.println("+ " + index);
            sum += index;
            System.out.println(sum);
            index++;
        }
    }

    public void forLoop() {
        System.out.println("Please enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int sum = 0;
        for (int index = 0; index <= inputNumber; index++) {
            sum += index;
            System.out.println("+ " + index);
            System.out.println(sum);
        }
    }

    public void takeANumber() throws Exception {
        System.out.println("Please enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
         {
            if (number % 2 != 0) {
                throw new Exception("Number is odd!");
            } else {
                System.out.println("Number is even: " + number);
            }
        }
    }
}
