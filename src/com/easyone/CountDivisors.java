package com.easyone;

import java.util.Scanner;

public class CountDivisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int k = scanner.nextInt();
        int count = 0;
        if (l < 0 || l > r || r > 1000) {
            System.exit(0);
        } else if (k < 0 || k > 1000) {
            System.exit(0);
        } else {
            for (int i = l; i <= r; i++) {
                if (i % k == 0) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}

