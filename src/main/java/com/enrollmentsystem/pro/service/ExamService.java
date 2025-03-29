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
          myNumbers.add(5);
          myNumbers.add(3);
          myNumbers.add(5);
          myNumbers.add(100);
          myNumbers.add(4);
          myNumbers.add(6);
          myNumbers.add(7);
          myNumbers.add(8);
          myNumbers.add(9);
          myNumbers.add(-10);
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
          myNumbers.add(60);
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
          myNumbers.add(104);
//
//          System.out.println(myNumbers.get(0));
//          System.out.println(myNumbers.get(1));
//          System.out.println(myNumbers.get(2));
//          System.out.println(myNumbers.get(3));
//          System.out.println(myNumbers.get(4));
//          System.out.println(myNumbers.get(5));
//          System.out.println(myNumbers.get(6));
//          System.out.println(myNumbers.get(7));
//          System.out.println(myNumbers.get(8));
//          System.out.println(myNumbers.get(9));
//          System.out.println(myNumbers.get(10));
//          System.out.println(myNumbers.get(11));
//          System.out.println(myNumbers.get(12));
//          System.out.println(myNumbers.get(13));
//          System.out.println(myNumbers.get(14));
//          System.out.println(myNumbers.get(15));
//          System.out.println(myNumbers.get(16));
//          System.out.println(myNumbers.get(17));
//          System.out.println(myNumbers.get(18));
//          System.out.println(myNumbers.get(19));
//          System.out.println(myNumbers.get(20));
//          System.out.println(myNumbers.get(21));
//          System.out.println(myNumbers.get(22));
//          System.out.println(myNumbers.get(23));
//          System.out.println(myNumbers.get(24));
//          System.out.println(myNumbers.get(25));
//          System.out.println(myNumbers.get(26));
//          System.out.println(myNumbers.get(27));
//          System.out.println(myNumbers.get(28));
//          System.out.println(myNumbers.get(29));
//          System.out.println(myNumbers.get(30));
//          System.out.println(myNumbers.get(31));
//          System.out.println(myNumbers.get(32));
//          System.out.println(myNumbers.get(33));
//          System.out.println(myNumbers.get(34));
//          System.out.println(myNumbers.get(35));
//          System.out.println(myNumbers.get(36));
//          System.out.println(myNumbers.get(37));
//          System.out.println(myNumbers.get(38));
//          System.out.println(myNumbers.get(39));
//          System.out.println(myNumbers.get(40));
//          System.out.println(myNumbers.get(41));
//          System.out.println(myNumbers.get(42));
//          System.out.println(myNumbers.get(43));
//          System.out.println(myNumbers.get(44));
//          System.out.println(myNumbers.get(45));
//          System.out.println(myNumbers.get(46));
//          System.out.println(myNumbers.get(47));
//          System.out.println(myNumbers.get(48));
//          System.out.println(myNumbers.get(49));
//          System.out.println(myNumbers.get(50));
//          System.out.println(myNumbers.get(51));
//          System.out.println(myNumbers.get(52));
//          System.out.println(myNumbers.get(53));
//          System.out.println(myNumbers.get(54));
//          System.out.println(myNumbers.get(55));
//          System.out.println(myNumbers.get(56));
//          System.out.println(myNumbers.get(57));
//          System.out.println(myNumbers.get(58));
//          System.out.println(myNumbers.get(59));
//          System.out.println(myNumbers.get(60));
//          System.out.println(myNumbers.get(61));
//          System.out.println(myNumbers.get(62));
//          System.out.println(myNumbers.get(63));
//          System.out.println(myNumbers.get(64));
//          System.out.println(myNumbers.get(65));
//          System.out.println(myNumbers.get(66));
//          System.out.println(myNumbers.get(67));
//          System.out.println(myNumbers.get(68));
//          System.out.println(myNumbers.get(69));
//          System.out.println(myNumbers.get(70));
//          System.out.println(myNumbers.get(71));
//          System.out.println(myNumbers.get(72));
//          System.out.println(myNumbers.get(73));
//          System.out.println(myNumbers.get(74));
//          System.out.println(myNumbers.get(75));
//          System.out.println(myNumbers.get(76));
//          System.out.println(myNumbers.get(77));
//          System.out.println(myNumbers.get(78));
//          System.out.println(myNumbers.get(79));
//          System.out.println(myNumbers.get(80));
//          System.out.println(myNumbers.get(81));
//          System.out.println(myNumbers.get(82));
//          System.out.println(myNumbers.get(83));
//          System.out.println(myNumbers.get(84));
//          System.out.println(myNumbers.get(85));
//          System.out.println(myNumbers.get(86));
//          System.out.println(myNumbers.get(87));
//          System.out.println(myNumbers.get(88));
//          System.out.println(myNumbers.get(89));
//          System.out.println(myNumbers.get(90));
//          System.out.println(myNumbers.get(91));
//          System.out.println(myNumbers.get(92));
//          System.out.println(myNumbers.get(93));
//          System.out.println(myNumbers.get(94));
//          System.out.println(myNumbers.get(95));
//          System.out.println(myNumbers.get(96));
//          System.out.println(myNumbers.get(97));
//          System.out.println(myNumbers.get(98));
//          System.out.println(myNumbers.get(99));

          Integer index = 0;
          Integer endIndex = 99;



//          while (index <= endIndex) {
//              System.out.println(myNumbers.get(index));
//              index = index + 1;
//          }

          Integer minNumber = myNumbers.get(0);
          while (index <= endIndex) {
              Integer itemNumber = myNumbers.get(index);
              if (itemNumber < minNumber) {
                 minNumber = itemNumber;
              }
              index = index + 1;
          }

          System.out.println("Minimum number is " + minNumber);
          System.out.println("The size is: " + myNumbers.size());
      }
      }
