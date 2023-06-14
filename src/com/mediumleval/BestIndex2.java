package com.mediumleval;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BestIndex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        List<Integer> sumArrayList = new ArrayList<>();
        for (int j = 1; j < length; j++) {
            List<Integer> tempArrayList = new ArrayList<>();
            tempArrayList.add(array[j - 1]);
            int d = 2;
            int start = j;

            while ((start + d - 1) < array.length) {
                int sum = 0;
                for (int i = start; i < (start + d); i++) {
                    sum += array[i];
                }
                tempArrayList.add(sum);
                start += d;
                d += 1;
            }

            int sum = 0;
            for (int num : tempArrayList) {
                sum += num;
            }
            sumArrayList.add(sum);
            tempArrayList.clear();
        }

        int max = Integer.MIN_VALUE;
        for (int num : sumArrayList) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println(max);
    }
}
