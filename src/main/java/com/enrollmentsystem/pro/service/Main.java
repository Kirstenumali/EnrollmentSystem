package com.enrollmentsystem.pro.service;
import com.enrollmentsystem.pro.User;
import com.enrollmentsystem.pro.userinterface.Menu;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ExamService examService = new ExamService();
        examService.inputNumber(4);
        examService.printNumbers();

        Menu menu = new Menu();
        menu.showMenu();

    }}