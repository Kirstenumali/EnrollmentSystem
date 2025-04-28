package com.enrollmentsystem.pro.service;

import com.enrollmentsystem.pro.Practice;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Practice practice = new Practice();
        ArrayList arrayList = new ArrayList();
        arrayList.add(5);
        arrayList.add(10);
        practice.checkArray(arrayList);
    }}