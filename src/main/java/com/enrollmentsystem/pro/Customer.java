package com.enrollmentsystem.pro;

import java.util.ArrayList;
import java.util.Objects;

public class Customer {
//    attributes
    private int age;
    private String lastName;
    private String firstName;
    private char sex;
    private String nationality;


    public Customer(int age, String lastName, String firstName, char sex, String nationality) {
        this.age = age;
        this.lastName = lastName;
        this.firstName = firstName;
        this.sex = sex;
        this.nationality = nationality;
    }

    public Customer() {
    }

    public void integrateIndentity() {
        ArrayList<Customer> list = new ArrayList<>();

        Customer c = new Customer(20,"Umali", "Kirsten", 'F', "Filipino");
        list.add(c);
        // getter
        System.out.println(c.getAge());
        System.out.println(c.getFirstName());
        System.out.println(c.getLastName());
        System.out.println(c.getSex());
        System.out.println(c.getNationality());

    }

//
//        Customer c = new Customer();
//        list.add(c);
//        // setter
//        c.setFirstName("Kirsten");
//        // getter
//        System.out.println(c.getFirstName());
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
