package com.kata;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindNextSquare {
    public static long findNextSquare(long sq) {
        double squareRoot = Math.sqrt(sq);
        boolean isSquare = squareRoot == Math.floor(squareRoot);
        if (isSquare) {
            return (long) Math.pow(squareRoot + 1, 2);
        } else {
            return -1;
        }
    }

    public static String repeatStr(final int repeat, final String string) {
        return string.repeat(repeat);
    }

    public static String abbrevName(String name) {
        String[] names = name.split(" ");


        return name;
    }

    public static void main(String[] args) {
        System.out.println(repeatStr(3, "a"));
    }

    public static int getCount(String str) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        int count = 0;
        for (char ch : str.toCharArray()) {
            if (vowels.contains(Character.toLowerCase(ch))) {
                count++;
            }
        }
        return count;
    }

    //smallest number in array
    public static int findSmallestInt(int[] args) {

        int smallest = args[0]; // Initialize smallest with the first element
        for (int i = 1; i < args.length; i++) {
            if (args[i] < smallest) {
                smallest = args[i]; // Update smallest if a smaller element is found
            }
        }
        return smallest;
    }


    //middle element
    public static String getMiddle(String word) {
        //Code goes here!
        int length = word.length();
        if (length % 2 == 0) {
            return word.substring(length / 2 - 1, length / 2 + 1);
        } else {
            return word.substring(length / 2, length / 2 + 1);
        }
    }

    public static int sortDesc(final int num) {
        //Your code
        // Convert the integer to a string
        String n = Integer.toString(num);
        // Split the string into an array of strings containing individual digits
        String[] a = n.split("");
        // Sort the array of digits in ascending order
        Arrays.sort(a);
        // Reverse the sorted array to get the digits in descending order
        StringBuilder sb = new StringBuilder();
        for (int i = a.length - 1; i >= 0; i--) {
            sb.append(a[i]);
        }
        // Convert the sorted array back into a string
        String sortedString = sb.toString();
        // Parse the string back into an integer and return it
        return Integer.parseInt(sortedString);
    }

    public int sum(List<?> mixed) {
        int sum = 0;
        for (Object object : mixed) {
            if (object instanceof String) {

                sum += Integer.parseInt((String) object);
            } else if (object instanceof Integer) {
                sum += (int) object;
            }
        }
        return sum;
    }

    public class Kata {
        public static int[] countPositivesSumNegatives(int[] input) {
            if (input == null || input.length == 0) {
                return new int[]{0, 0};
            }

            int positiveCount = 0;
            int sumNegatives = 0;

            for (int inp : input) {
                if (inp > 0) {
                    positiveCount++;
                } else if (inp < 0) {
                    sumNegatives += inp;
                }
            }

            return new int[]{positiveCount, sumNegatives};
        }
    }
}
