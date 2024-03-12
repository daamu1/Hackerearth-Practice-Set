package com.kata;

public class FromAToZ {
    public static String gimmeTheLetters(String s) {
        String[] chars = s.split("-");
        char first = chars[0].charAt(0);
        char second = chars[1].charAt(0);
        int dif = second - first;

        StringBuilder stringBuilder = new StringBuilder();

        if (dif == 0) {
            stringBuilder.append(first);
        } else {
            for (char ch = first; ch <= second; ch++) {
                stringBuilder.append(ch);
            }
        }

        return stringBuilder.toString();
    }

    public static String[] oneTwoThree(int n) {
        // your code goes here, please
        String firstElement;
        StringBuilder secondElement = new StringBuilder();
        if (n < 10) {
            firstElement = String.valueOf(n);
        } else {
            char[] arrray = String.valueOf(n).toCharArray();
            firstElement = String.valueOf(arrray[arrray.length - 1]) + String.valueOf(n);
        }
        secondElement.append("1".repeat(Math.max(0, n)));


        return new String[]{firstElement, secondElement.toString()};
    }
}
