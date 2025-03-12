package com.enrollmentsystem.pro.userinterface;

import com.enrollmentsystem.pro.business.UserService;

import java.util.Scanner;

public class Menu {

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This is an enrollment system. Please enter the code of your action:");

        System.out.println("1. Add a new user");
        System.out.println("2. Edit user info");
        System.out.println("3. Delete a user");
        System.out.println("4. View all registered users");

        int choice = scanner.nextInt();
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

        UserService userService = new UserService();
        userService.doActionOnUserGetANumber(choice);
    }

}
