package com.kata;

public class CenturyFromYear {
    public static int century(int year) {
        int century = year / 100;
        if (year % 100 > 0) {
            century++;
        }
        return century;
    }
}
