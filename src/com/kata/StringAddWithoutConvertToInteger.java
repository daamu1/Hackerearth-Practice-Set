package com.kata;

import java.util.Arrays;
import java.util.Scanner;

public class StringAddWithoutConvertToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("## Enter the first String ##");
        String firstString = scanner.nextLine();

        System.out.println("## Enter the Second String ##");
        String secondString = scanner.nextLine();

        System.out.println("## Final String ##");

        System.out.println(sumOfString(firstString, secondString));
    }

    private static String sumOfString(String firstString, String secondString) {
        StringBuilder stringBuilder = new StringBuilder();
        int carry = 0;
        int maxLength = Math.max(firstString.length(), secondString.length());

        for (int i = 0; i < maxLength; i++) {
            int firstDigit;
            int secondDigit;

            if (i < firstString.length()) {
                firstDigit = Integer.parseInt(String.valueOf(firstString.charAt(firstString.length() - 1 - i)));
            } else {
                firstDigit = 0;
            }

            if (i < secondString.length()) {
                secondDigit = Integer.parseInt(String.valueOf(secondString.charAt(secondString.length() - 1 - i)));
            } else {
                secondDigit = 0;
            }
            int sum = firstDigit + secondDigit + carry;
            stringBuilder.insert(0, sum % 10);
            carry = sum / 10;
        }
        if (carry > 0) {
            stringBuilder.insert(0, carry);
        }

        return stringBuilder.toString();
    }
}
