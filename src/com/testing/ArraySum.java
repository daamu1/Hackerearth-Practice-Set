package com.testing;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t > 0) {
            int N = scanner.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }
            int sum = 0;
            for (int i = 0; i < N; i++) {
                sum += arr[i];
            }

            System.out.println(sum);

            t--;
        }
        scanner.close();
    }
}
