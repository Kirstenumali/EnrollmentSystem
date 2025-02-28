package com.enrollmentsystem.pro;

import com.enrollmentsystem.pro.service.UserService;

public class User implements UserService {
    // attributes
//    instance variable
    public String name;
    public byte age;
    protected String sex;
    String id;

    // modifier or access type
//    public, private, protected, package
    public void printOddNumbers(int num) {
        StringBuilder result = new StringBuilder();

       for (int i = 1; i < num; i+=2) {
       result.append(i).append(", ");
       }

       if (result.length() > 0) {
           result.setLength(result.length() - 2);
       }

        System.out.println(result.toString());
    }

    public byte getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void showInfo() {
        System.out.println("user name is: sth and user age is: sth");
    }

    public void showInfoWithInputValue(byte myAge, String myName) {
        System.out.println("user name is: " + myAge + " and user age is: " + myName);
    }


    @Override
    public String getUserName() {
        return "testUser";
    }

    @Override
    public String getUserPassword() {
        return "1234";
    }

    @Override
    public String getUserEmail() {
        return "kristen@gmail.com";
    }

    @Override
    public void printUserInfo() {
        System.out.println("user name is: test user");
    }

    @Override
    public void printPersonalInfoWithInputValue(String userName, String userEmail, int userAge) {
        System.out.println("user name is: " + userName + " and user age is: " + userAge);
    }
}
