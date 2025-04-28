package com.enrollmentsystem.pro;
import java.util.ArrayList;
public class Practice {

    public void takeANumber(int number) {
        if (number % 5 == 0) {
            System.out.println(number);
        }
    }

    public void checkArray(ArrayList numbers) {
        int number = (int) numbers.get(0);
        if (number % 5 == 0) {
            System.out.println(number);
        }
    }
}
