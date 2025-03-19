package com.enrollmentsystem.pro;


import java.util.Scanner;

public class User {
    private String name;

    public void getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a username: ");
        String name = scanner.next();
        System.out.println("Hello," + name);
        scanner.close();
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
