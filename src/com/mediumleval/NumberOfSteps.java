package com.mediumleval;

import java.util.Scanner;

public class NumberOfSteps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();
        int[] array1 = new int[sizeOfArray];
        int[] array2 = new int[sizeOfArray];
        int n = array1.length;
        int count = 0;
        Boolean flag = false;
        for (int i = 0; i < sizeOfArray; i++) {
            array1[i] = scanner.nextInt();
        }
        for (int i = 0; i < sizeOfArray; i++) {
            array2[i] = scanner.nextInt();
        }
        int minValue = array1[0];
        for (int i = 0; i <= n - 1; i++) {

            if (array1[i] <= minValue) {
                minValue = array1[i];
            }
        }
        for (int i = 0; i <= n - 1; i++) {
            if (array1[i] == minValue) {
                continue;
            }
            while (array1[i] > minValue && array1[i] > array2[i]) {
                array1[i] = array1[i] - array2[i];
                count++;
            }
        }
        for (int i = 0; i <= n - 1; i++) {
            flag=false;
            if (array1[i] == array1[i + 1]) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println(count);
        } else {
            System.out.println(-1);
        }
    }
}
