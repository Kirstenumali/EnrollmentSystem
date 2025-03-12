package com.enrollmentsystem.pro.business;

import com.enrollmentsystem.pro.User;
import com.enrollmentsystem.pro.userinterface.Menu;

import java.util.ArrayList;

public class UserService {

    public void doActionOnUserGetANumber(int selectedOperationCode) {
        if (selectedOperationCode == 1) {
            // TODO add user
            addUser();

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
        System.out.println("A new user has been created");
    }

    public void editUser() {
        System.out.println("A new user has been updated");
    }

    public void deleteUser() {
        System.out.println("A new user has been deleted");
    }

    public ArrayList getAllRegisteredUsers() {
        ArrayList users = new ArrayList();
        User user1 = new User();
        user1.setName("John");
        users.add(user1);

        User user2 = new User();
        user2.setName("Jane");
        users.add(user2);

        User user3 = new User();
        user3.setName("Bob");
        users.add(user3);

        System.out.println("All registered users have been created");

        return users;
    }
}
