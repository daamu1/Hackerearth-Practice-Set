package com.easyone;

import java.util.Scanner;

import java.util.Scanner;

public class MaximumBorders {
    public static void main(String[] args) {

        int totalNoTest;
        int totalNoRow;
        int totalNoColumn;
        int maximumHash;
        int hashCounter;

        Scanner scanner = new Scanner(System.in);
        totalNoTest = scanner.nextInt();

        for (int i = 0; i < totalNoTest; i++) {
            totalNoRow = scanner.nextInt();
            totalNoColumn = scanner.nextInt();

            char[][] arr = new char[totalNoRow][totalNoColumn];

            // input
            for (int j = 0; j < totalNoRow; j++) {
                String rowContent = scanner.next();
                for (int k = 0; k < totalNoColumn; k++) {
                    arr[j][k] = rowContent.charAt(k);
                }
            }

            maximumHash = 0;

            // totalNoRow-wise scan
            for (int j = 0; j < totalNoRow; j++) {
                hashCounter = 0;
                for (int k = 0; k < totalNoColumn; k++) {
                    if (arr[j][k] == '#') {
                        hashCounter++;
                    } else if (arr[j][k] == '.') {
                        if (hashCounter > 0) {
                            if (hashCounter > maximumHash) {
                                maximumHash = hashCounter;
                            }
                            hashCounter = 0;
                        }
                    }
                }
                if (hashCounter > maximumHash) {
                    maximumHash = hashCounter;
                }
            }

            // totalNoColumn-wise scan
            for (int j = 0; j < totalNoColumn; j++) {
                hashCounter = 0;
                for (int k = 0; k < totalNoRow; k++) {
                    if (arr[k][j] == '#') {
                        hashCounter++;
                    } else if (arr[k][j] == '.') {
                        if (hashCounter > 0) {
                            if (hashCounter > maximumHash) {
                                maximumHash = hashCounter;
                            }
                            hashCounter = 0;
                        }
                    }
                }
                if (hashCounter > maximumHash) {
                    maximumHash = hashCounter;
                }
            }

            System.out.println(maximumHash);
        }
    }
}