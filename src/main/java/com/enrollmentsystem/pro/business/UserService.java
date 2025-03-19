package com.enrollmentsystem.pro.business;
import com.enrollmentsystem.pro.dataaccess.UserDao;
import java.util.ArrayList;
import java.util.Scanner;

public class UserService {

    public void doActionOnUserGetANumber(int selectedOperationCode) {
        if (selectedOperationCode == 1) {
            // TODO add user
            ArrayList addAUser = addUser();
            System.out.println(addAUser);

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

    public ArrayList addUser() {
        System.out.println("Enter the name of the user");
        Scanner scanner = new Scanner(System.in);
        scanner.next();
//        UserDao userDao = new UserDao();
//        ArrayList users = userDao.addUser();
        return null;

    }

    public void editUser() {
        System.out.println("A new user has been updated");
    }

    public void deleteUser() {
        System.out.println("A new user has been deleted");
    }

    public ArrayList getAllRegisteredUsers() {

        UserDao userDao = new UserDao();

        ArrayList users = userDao.getAllUser();
        return users;
    }
}
