package com.easyone;

import java.util.Scanner;

public class SevenSegmentDisplay {
    public static void main(String args[]) throws Exception {
        // Scanner
        Scanner scanner = new Scanner(System.in);
        int testCaseCount = scanner.nextInt();
        for (int i = 0; i < testCaseCount; i++) {
            String number = scanner.next();
            int count = 0;
            for (int j = 0; j < number.length(); j++) {
                char digit = number.charAt(j);
                if (digit == '9' || digit == '6' || digit == '0') {
                    count += 6;
                }
                if (digit == '1') {
                    count += 2;
                }
                if (digit == '2' || digit == '3' || digit == '5') {
                    count += 5;
                }
                if (digit == '4') {
                    count += 4;
                }
                if (digit == '7') {
                    count += 3;
                }
                if (digit == '8') {
                    count += 7;
                }
            }
            if (count % 2 == 0) {
                for (int l = 0; l < count / 2; l++) {
                    System.out.print(1);
                }
            } else {
                System.out.print(7);
                count -= 3;
                for (int l = 0; l < count / 2; l++) {
                    System.out.print(1);
                }
            }
            System.out.println();
        }
    }
}
