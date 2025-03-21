package com.enrollmentsystem.pro.userinterface;

import com.enrollmentsystem.pro.business.UserService;

import java.util.Scanner;

public class Menu {

    private UserService userService;

    public Menu() {
        this.userService = new UserService();
    }

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This is an enrollment system. Please enter the code of your action:");

        System.out.println("1. Add a new user");
        System.out.println("2. Edit user info");
        System.out.println("3. Delete a user");
        System.out.println("4. View all registered users");
        System.out.println("5. Exit");

        int choice = scanner.nextInt();
        System.out.println("You have selected the number: " + choice);

        userService.doActionOnUserGetANumber(choice);


        if (choice == 1) {
            showMenu();

        } else if (choice == 2) {
            showMenu();
        } else if (choice == 3) {
            showMenu();
        } else if (choice == 4) {
            showMenu();
        } else if (choice == 5) {
            System.out.println("Exiting the program...");
            scanner.close();
        } else {
            System.out.println("Invalid choice, please select a valid option (1-5).");
        }

        scanner.close();
    }
}
