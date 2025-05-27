package com.enrollmentsystem.pro;
import java.util.ArrayList;
public class Practice {

    public void takeANumber(int number) {
        if (number % 5 == 0) {
            System.out.println(number);
        }
    }

    public void checkArray(ArrayList numbers) {
        int size = numbers.size();

        for (int i = 0; i < size; i++) {
        int number = (int) numbers.get(i);

        if (number % 5 == 0) {
            System.out.println(number);
        }
        if (i == size -1) {
            break;
        }
        }
    }
}
