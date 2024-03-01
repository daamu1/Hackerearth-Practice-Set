package com.kata;

public class SquareSum {
    public static int squareSum(int[] n) {
        int sum = 0;
        for (int number : n) {
            sum = sum + number * number;
        }
        return sum;
    }
}
