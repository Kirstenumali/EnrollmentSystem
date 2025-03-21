package com.enrollmentsystem.pro.dataaccess;

import com.enrollmentsystem.pro.User;
import com.enrollmentsystem.pro.userinterface.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class UserDao {

    // database
    private ArrayList<User> userDatabase;
    // constructor
    public UserDao() {
        userDatabase = new ArrayList<>();
    }

    public ArrayList getAllUser() {

//        User user1 = new User();
//        user1.setName("John");
//        userDatabase.add(user1);
//
//        User user2 = new User();
//        user2.setName("Jane");
//        userDatabase.add(user2);
//
//        User user3 = new User();
//        user3.setName("Bob");
//        userDatabase.add(user3);
//
//        System.out.println("All registered users have been created");
        return userDatabase;

    }

    public void updateUser(int itemIndex, String newUserName) {
        User user = userDatabase.get(itemIndex);
        user.setName(newUserName);
        userDatabase.set(itemIndex, user);
    }

    public void addUser(User newUser) {
        userDatabase.add(newUser);
    }

    public void deleteUser(int itemIndex) {
        userDatabase.remove(itemIndex);
    }
}
