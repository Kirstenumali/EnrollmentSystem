package com.enrollmentsystem.pro.service;

import java.util.ArrayList;
import java.util.Arrays;

public class StringUtil {

    public void encodeString(String message, String encodeChar) {
        String[] strSplit = message.split("");
        ArrayList<String> strList = new ArrayList<String>(
        Arrays.asList(strSplit));

        for (int index = 0; index < strList.size(); index++) {

            if (strList.get(index).equals(encodeChar)) {
                strList.set(index, "$");
            }
        }
         System.out.println(String.join("",strList));
    }
}
