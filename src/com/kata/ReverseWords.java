package com.kata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {

    public static void main(String[] args) {
        int b = duplicateCount("Sam");
        List<String> a = new ArrayList<>();
        a.add("Ravi");
        a.add("Ram");
        a.add("abcd");
        a.add("Shyam");

        System.out.println(returnValidName(a).toString());

    }

    public static String reverseWords(final String original) {
        if (original.isBlank()) {
            return original;
        }
        String[] words = original.split(" ");

        String[] reversedWords = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            reversedWords[i] = reversedWord.toString();
        }

        return String.join(" ", reversedWords);
    }

    public static String makeComplement(String dna) {
        StringBuilder complement = new StringBuilder();
        for (int i = 0; i < dna.length(); i++) {
            char currentChar = dna.charAt(i);
            if (currentChar == 'A') {
                complement.append('T');
            } else if (currentChar == 'T') {
                complement.append('A');
            } else if (currentChar == 'G') {
                complement.append('C');
            } else if (currentChar == 'C') {
                complement.append('G');
            }
        }
        return complement.toString();
    }

    public static boolean isTriangle(int a, int b, int c) {
        List<Integer> measurement = new ArrayList<>();
        measurement.add(a);
        measurement.add(b);
        measurement.add(c);
        Collections.sort(measurement);
        int h = measurement.get(0) * measurement.get(0);
        int bb = (measurement.get(1) * measurement.get(1)) + measurement.get(2) * measurement.get(2);
        if (h > bb) {
            return false;
        } else {

            return true;
        }
    }

    public static Object[] removeEveryOther(Object[] arr) {

        Object[] arr2;
        if (arr.length % 2 == 0) {
            arr2 = new Object[arr.length / 2];
        } else {
            arr2 = new Object[arr.length / 2 + 1];

        }
        int j = 0;

        // happy coding
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr2[j] = arr[i];
                j++;
            }
        }
        return arr2;
    }

    public static int duplicateCount(String text) {
        // Write your code here
        int count = 0;
        String[] chars = text.split("");

        return count;
    }

    public static int sumOfSqr(List<Integer> integers) {
        int sum = 0;
        for (int i : integers) {
            sum = sum + (i * i);
        }
        return sum;
    }

    public int min(int[] list) {
        Arrays.sort(list);
        return list[0];
    }

    public int max(int[] list) {
        Arrays.sort(list);
        return list[list.length - 1];
    }

    public static List<String> returnValidName(List<String> names) {
        names.removeIf(string -> string.length() != 4);
        return names;

    }
}
