package com.enrollmentsystem.pro.service;

import com.enrollmentsystem.pro.Payments;
import com.enrollmentsystem.pro.User;
import com.enrollmentsystem.pro.userinterface.Menu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ExamService examService = new ExamService();
        examService.inputNumber(4);

        Menu menu = new Menu();
        menu.showMenu();

    }}