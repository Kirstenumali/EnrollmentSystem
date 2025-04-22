package com.enrollmentsystem.pro.service;

public class Main {

    public static void main(String[] args) {
        ExamService examService = new ExamService();
        try {
            examService.takeANumber();
        } catch (Exception e) {
            System.out.println("This is an exception.");
            throw new RuntimeException(e);
        }
    }}