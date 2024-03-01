package com.easyone;

import java.util.Scanner;

public class FindPair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalNumberOfElement = scanner.nextInt();
        int[] elements = new int[totalNumberOfElement];
        for (int i = 0; i < totalNumberOfElement; i++) {
            elements[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 0; i < totalNumberOfElement; i++) {
            for (int j = 0; j < totalNumberOfElement; j++) {
                if (i != j && (elements[i] - elements[j]) / (i - j) == 1) {
                    count++;
                }
            }
        }
        System.out.println(count);
        scanner.close();
    }

}
