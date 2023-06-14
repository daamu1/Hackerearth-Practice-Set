package com.easyone;

import java.util.Scanner;

public class CountOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases

        for (int i = 0; i < t; i++) {
            String S = scanner.next(); // input string
            char k = scanner.next().charAt(0); // character to count

            int count = solve(S, k);
            System.out.println(count);
        }
    }

    public static int solve(String S, char k) {
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == k) {
                count++;
            }
        }
        return count;
    }
}
