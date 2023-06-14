package com.mediumleval;
import java.util.Scanner;

public class BestIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int start = 1;
        int k = 2;

        while (start <= n) {
            start += k;
            k++;
        }
//
        start = k - 1;
        k -= 2;
        int initialSum = 0;
        for (int i = 0; i < start; i++) {
            initialSum += a[i];
        }

        int ma = initialSum;
        System.out.println(ma);

        for (int i = 1; i < n; i++) {
            initialSum -= a[i - 1];

            if (start < n) {
                initialSum += a[start];
                start++;
            } else {
                k--;
                initialSum -= sum(a, n - k, n);
                start -= k;
            }

            if (initialSum > ma) {
                ma = initialSum;
            }
        }

        System.out.println(ma);
    }

    private static int sum(int[] array, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += array[i];
        }
        return sum;
    }
}
