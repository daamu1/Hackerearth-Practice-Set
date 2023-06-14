package com.mediumleval;
import java.util.Arrays;
import java.util.Scanner;

public class MinimizeArrayCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Number of elements in the array
        int N = scanner.nextInt();
        // Maximum distance between elements
        int K = scanner.nextInt();
        int[] array = new int[N];

        // Read the array elements
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        int minCost = minimizeArrayCost(array, K);
        System.out.println(minCost);
    }

    private static int minimizeArrayCost(int[] array, int K) {
        int N = array.length;
        int[] transfer = new int[N]; // Transfer array with N zeros initially

        // Sort the array in non-decreasing order
        Arrays.sort(array);

        int cost = 0;
        for (int i = 0; i < N; i++) {
            int numTransfers = Math.min(array[i], K);

            // Transfer value from current element to its nearby elements
            for (int j = i + 1; j <= i + numTransfers; j++) {
                if (j < N) {
                    int transferValue = Math.min(K - (j - i), array[i]);
                    transfer[j] += transferValue;
                    array[i] -= transferValue;
                  }
            }
        }

        return cost;
    }
}
