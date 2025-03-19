package com.enrollmentsystem.pro.business;
import com.enrollmentsystem.pro.User;
import com.enrollmentsystem.pro.dataaccess.UserDao;
import java.util.ArrayList;
import java.util.Scanner;

public class UserService {
    private UserDao userDao;

    public void doActionOnUserGetANumber(int selectedOperationCode) {
        if (selectedOperationCode == 1) {
            // TODO add user
            addUser();
            ArrayList result = getAllRegisteredUsers();
            System.out.println(result);

        }
        else if (selectedOperationCode == 2) {
            // TODO edit user
            editUser();
        }
        else if (selectedOperationCode == 3) {
            // TODO delete user
            deleteUser();
        }
        else if (selectedOperationCode == 4) {
            // TODO view all registered user
            ArrayList result = getAllRegisteredUsers();
            System.out.println(result);
        }
        else {
            System.out.println("You must select 1-4 numbers");
        }
    }

    public void addUser() {
        System.out.println("Enter the name of the user");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Your username is " + userName);
        scanner.close();
        User newUser = new User();
        newUser.setName(userName);
        if (userDao == null) {
            UserDao newUserDao = new UserDao();
            userDao = newUserDao;
        }
        userDao.addUser(newUser);
    }

    public void editUser() {
        System.out.println("A new user has been updated");
    }

    public void deleteUser() {
        System.out.println("A new user has been deleted");
    }

    public ArrayList getAllRegisteredUsers() {
        if (userDao == null) {
            UserDao newUserDao = new UserDao();
            userDao = newUserDao;
        }
        ArrayList users = userDao.getAllUser();
        return users;
    }
}
