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

    public boolean userExist(User user) {
        Boolean isExist = userDatabase.contains(user);
        return isExist;
    }

    public void deleteUser(int itemIndex) {
        userDatabase.remove(itemIndex);
    }
}
