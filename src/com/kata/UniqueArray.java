package com.kata;

public class UniqueArray {

    public static void main(String[] args) {
        double[] numbers = {0, 0, 0, 0, 0};

        System.out.println(findUniq(numbers));
    }

    public static double findUniq(double arr[]) {
        double uniqueNumber = Integer.MIN_VALUE;

        int count = 0;
        for (double num : arr) {
            if (num == arr[0]) {
                count++;
                if(count>=1)
                {
                    break;
                }

            }
        }

        if (count == 1) {
            uniqueNumber = arr[0];
        } else {
            for (double num : arr) {
                if (num != arr[0]) {
                    uniqueNumber = num;
                    break;
                }
            }
        }
        return uniqueNumber;
    }
}
