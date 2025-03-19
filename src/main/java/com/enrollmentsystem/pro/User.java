package com.enrollmentsystem.pro;


import java.util.Scanner;

public class User {
    private String name;

    // THIS method are accessor
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
