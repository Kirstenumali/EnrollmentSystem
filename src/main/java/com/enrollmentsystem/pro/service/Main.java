package com.enrollmentsystem.pro.service;

import com.enrollmentsystem.pro.Payments;
import com.enrollmentsystem.pro.User;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // memorize, assign
        User myFriend = new User();
        myFriend.printUserInfo();
        myFriend.showInfo();
        myFriend.getUserEmail();
        myFriend.showInfoWithInputValue((byte) 5, "Barbie");
        myFriend.showInfoWithInputValue((byte) 38, "Fred");
        myFriend.showInfoWithInputValue((byte) 30, "Breadi");
        myFriend.showInfoWithInputValue((byte) 32, "Ibrahim");
        myFriend.showInfoWithInputValue((byte) 34, "Akhmed");
        myFriend.age = 30;
        myFriend.name = "Fred";

        byte nilooAge;
        nilooAge = myFriend.getAge();
        System.out.println("Nilo Age is " + nilooAge);

        String nilooName = myFriend.getName();
        // nul == undefined/nothing
        System.out.println("Nilo Name is " + nilooName);

        // task 1
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int userInput = scanner.nextInt();

        User user = new User();
        user.printOddNumbers(userInput);

        // Task 2
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("This is an enrollment system. Please enter the code of your action:");

        System.out.println("1. Add a new user");
        System.out.println("2. Edit user info");
        System.out.println("3. Delete a user");
        System.out.println("4. View all registered users");

        int choice = scanner2.nextInt();
        System.out.println("You have selected the number: " + choice);

        switch (choice) {
            case 1:
                System.out.println("You selected: Add a new user");
                break;
            case 2:
                System.out.println("You selected: Edit user info");
                break;
            case 3:
                System.out.println("You selected: Delete a user");
                break;
            case 4:
                System.out.println("You selected: View all registered users");
                break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 4.");
        }
        scanner.close();

    }}