package com.enrollmentsystem.pro.service;

import com.enrollmentsystem.pro.Practice;
import com.enrollmentsystem.pro.Teacher;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        Practice practice = new Practice();
//        ArrayList arrayList = new ArrayList();
//        arrayList.add(5);
//        arrayList.add(10);
//        arrayList.add(20);
//        arrayList.add(13);
//        arrayList.add(35);
//        arrayList.add(50);
//        practice.checkArray(arrayList);

        Teacher<Integer> teacher = new Teacher();
        teacher.setName("Niloo");
        teacher.setId(1223);

        Teacher<String> newTeacher = new Teacher();
        newTeacher.setName("Kirsten");
        newTeacher.setId("1332");

        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(7665);
    }}