package com.easyone;

import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalNoOfelement = scanner.nextInt();
        int[] arrayOfNo = new int[totalNoOfelement];
        int[] arrayOfNo2 = new int[totalNoOfelement];
        //Take input
        for (int i = 0; i < arrayOfNo.length; i++) {
            arrayOfNo[i] = scanner.nextInt();
        }

        for (int i = 0; i < arrayOfNo.length; i++) {
            int modeValue = arrayOfNo[i] % 10;
            arrayOfNo2[i] = modeValue;
        }
        //check condition
        int arrayLastValue = arrayOfNo[arrayOfNo2.length - 1];
        String s = String.valueOf(arrayLastValue);
        if (s.endsWith("0")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
