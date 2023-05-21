package com.easyone;

import java.util.Scanner;

class FindProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int arraySize = scanner.nextInt();

        if (arraySize < 1 || arraySize > 1000) {
            System.exit(0);
        }
        // Read the array elements
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }

        // Calculate the product module
        long module = (long) 1000000007;
        long product = 1;

        for (int i = 0; i < arraySize; i++) {
            product = (product * array[i]) % module;
        }

        // Print the result
        System.out.println(product);
    }
}
