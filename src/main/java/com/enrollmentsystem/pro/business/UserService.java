package com.enrollmentsystem.pro.business;
import com.enrollmentsystem.pro.User;
import com.enrollmentsystem.pro.dataaccess.UserDao;
import java.util.ArrayList;
import java.util.Scanner;

public class UserService {
    private UserDao userDao;

    public void doActionOnUserGetANumber(int selectedOperationCode) throws Exception {
        if (selectedOperationCode == 1) {
            addUser();
        } else if (selectedOperationCode == 2) {
            editUser();
        } else if (selectedOperationCode == 3) {
            deleteUser();
        } else if (selectedOperationCode == 4) {
            ArrayList result = getAllRegisteredUsers();
            System.out.println(result);
        } else if (selectedOperationCode == 5)  {
            exitUser();
        } else {
            // check Exception
            throw new Exception();
        }
    }

    public void addUser() {
        System.out.println("Enter the name of the user");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("Your username is " + userName);
        User newUser = new User();
        newUser.setName(userName);
        System.out.println("Please enter the last name");
        String lastName = scanner.nextLine();
        newUser.setLastName(lastName);
        System.out.println("Your last name is " + lastName);
        System.out.println("Please enter your passport number ");
        Integer passportNumber = Integer.valueOf(scanner.nextLine());
        newUser.setPassportNumber(passportNumber);
        System.out.println("Your passport number is " + passportNumber);
        if (userDao == null) {
            userDao = new UserDao();
        }
        Boolean isUserExist = userDao.userExist(newUser);
        if (isUserExist.equals(false)) {
        System.out.println(isUserExist);
        userDao.addUser(newUser);
        ArrayList result = getAllRegisteredUsers();
        System.out.println(result);
        } else {
            System.out.println("Our user is in database");
        }
    }

    public void editUser() {
        System.out.println("Please enter the location of item");
        Scanner scanner = new Scanner(System.in);
        String itemIndex = scanner.nextLine();
        System.out.println("Your item location is " + itemIndex);
        System.out.println("Please enter your new name");
        String newUserName = scanner.nextLine();
        System.out.println("Your new username is: " + newUserName);
        if (userDao == null) {
            userDao = new UserDao();}
        userDao.updateUser(Integer.parseInt(itemIndex)-1, newUserName);
    }

    public void exitUser() {
        System.out.println("Exiting...");
    }

    public void deleteUser() {
        System.out.println("What index of user you want to delete?");
        Scanner scanner = new Scanner(System.in);
        int itemIndex = Integer.parseInt(scanner.next());
        System.out.println("You chose number:  " + itemIndex);
        int minusIndex = (itemIndex)-1;
        if (userDao == null) {
            userDao = new UserDao();
        }
        System.out.println("Deleting the user...");
        userDao.deleteUser(minusIndex);
    }

    public ArrayList getAllRegisteredUsers() {
        if (userDao == null) {
            userDao = new UserDao();
        }
        ArrayList result = userDao.getAllUser();
        if (result.isEmpty()) {
            // Uncheck Exception
            throw new RuntimeException();
        }
    }


}
