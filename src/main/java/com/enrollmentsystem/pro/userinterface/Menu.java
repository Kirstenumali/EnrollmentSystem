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
        String choice = scanner.next();

        System.out.println("You have selected the number: " + choice);
//        checkInputValue(choice);
        if (choice.equals("1") || choice.equals("2") || choice.equals("3") || choice.equals("4")) {
            try {
                userService.doActionOnUserGetANumber(Integer.parseInt(choice));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else if (choice.equals("5")) {
            System.out.println("Exiting the program...");
            scanner.close();
            return;
        } else {
            System.out.println("Input value is not acceptable. Please enter a number (1-5)");
        }
        showMenu();
        scanner.close();
    }
}
