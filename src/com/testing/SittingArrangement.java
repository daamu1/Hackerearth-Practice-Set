package com.testing;

import java.util.Scanner;

public class SittingArrangement {
    public static void populateArray(int[] arr, int N) {
        int start = 1;
        int end = N;

        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                arr[i] = start;
                start += 2;
            } else {
                arr[i] = end;
                end -= 2;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt(); // Number of test cases

        while (t > 0) {
            int N = scanner.nextInt(); // Size of the array
            int[] arr = new int[N];

            populateArray(arr, N);

            for (int i = 0; i < N; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            t--;
        }

        scanner.close();
    }
}
