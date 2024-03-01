package com.kata;

public class FindAverage {
    public static double find_average(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum = sum + number;
        }
        return (double) sum /array.length;
    }
}
