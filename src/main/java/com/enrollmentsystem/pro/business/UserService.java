package com.enrollmentsystem.pro.business;

import com.enrollmentsystem.pro.User;
import com.enrollmentsystem.pro.dataaccess.UserDao;

import java.util.ArrayList;
import java.util.Scanner;

public class UserService {
    private UserDao userDao;

    public void doActionOnUserGetANumber(int selectedOperationCode) {
        if (selectedOperationCode == 1) {
            addUser();
        }
        else if (selectedOperationCode == 2) {
            editUser();
        }
        else if (selectedOperationCode == 3) {
            // Delete user
            deleteUser();
        }
        else if (selectedOperationCode == 4) {
            ArrayList result = getAllRegisteredUsers();
            System.out.println(result);
        }
        else if (selectedOperationCode == 5) {
            exitUser();
        }
        else {
            System.out.println("You must select 1-5 numbers");
        }
    }

    public void addUser() {
        System.out.println("Enter the name of the user");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("Your username is " + userName);

        User newUser = new User();
        newUser.setName(userName);

        if (userDao == null) {
            userDao = new UserDao();
        }

        userDao.addUser(newUser);

        ArrayList result = getAllRegisteredUsers();
        System.out.println(result);
    }

    public void editUser() {
        System.out.println("A new user has been updated");
    }

    public void exitUser() {
        System.out.println("Exiting...");
    }

    public void deleteUser() {
        System.out.println("A new user has been deleted");
    }

    public ArrayList getAllRegisteredUsers() {
        if (userDao == null) {
            userDao = new UserDao();
        }
        return userDao.getAllUser();
    }
}
