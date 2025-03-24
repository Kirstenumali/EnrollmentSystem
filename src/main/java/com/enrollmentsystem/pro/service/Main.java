package com.enrollmentsystem.pro.service;
import com.enrollmentsystem.pro.User;
import com.enrollmentsystem.pro.userinterface.Menu;

public class Main {

    public static void main(String[] args) {
        ExamService examService = new ExamService();
        examService.inputNumber(4);

        // TODO push this code in Github
        // TODO complete the task
        Menu menu = new Menu();
        menu.showMenu();

    }}