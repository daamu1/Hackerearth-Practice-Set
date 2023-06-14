package com.easyone;

import java.util.Scanner;


public class LargestNumberAfterDeletion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int k = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < k; i++) {
            number = maximumNumber(number);
        }
        System.out.println(number);
    }

    private static String maximumNumber(String number) {
        long maximum = Long.MIN_VALUE;
        for (int i = 0; i < number.length(); i++) {
            long indexRemovedNum = Long.parseLong(number.substring(0, i) + number.substring(i + 1));
            if (indexRemovedNum > maximum) {
                maximum = indexRemovedNum;
            }
        }
        return String.valueOf(maximum);
    }

}