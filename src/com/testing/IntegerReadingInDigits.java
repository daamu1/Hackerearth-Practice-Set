package com.testing;

import java.util.Scanner;

public class IntegerReadingInDigits {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int op=getMatchStick(number);
        System.out.println(op);
//        while (number > 0) {
//            System.out.println( number % 10);
//            number = number / 10;
//        }
    }
    private static int getMatchStick(int number) {
        int maxcount = 0;
        int count = 0;
        while (number > 0) {
            int tempNuber = number % 10;
            if (tempNuber == 0 || tempNuber == 9 || tempNuber == 7) {
                count = 6;
            } else if (tempNuber == 2 || tempNuber == 3 || tempNuber == 5) {
                count = 5;
            } else if (tempNuber == 1) {
                count = 2;
            } else if (tempNuber == 4) {
                count = 4;
            } else {
                count = 8;
            }
            maxcount = maxcount + count;
            number = number / 10;
        }
        return maxcount;
    }
}
