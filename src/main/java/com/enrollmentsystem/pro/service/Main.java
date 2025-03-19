package com.enrollmentsystem.pro.service;
import com.enrollmentsystem.pro.User;
import com.enrollmentsystem.pro.userinterface.Menu;

public class Main {

    public static void main(String[] args) {
        ExamService examService = new ExamService();
        examService.inputNumber(4);
        Menu menu = new Menu();
        menu.showMenu();

    }}