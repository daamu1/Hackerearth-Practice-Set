package com.easyone;

import java.util.Scanner;


public class FactorialNumber {

    public static void main(String[] args) {
        System.out.println("Enter the Number -");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println(factorial);
    }
}
