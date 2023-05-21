package com.testing;
import java.util.Scanner;

public class ArrayReading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many rows do you want -->");
        int totalNoOfRows = sc.nextInt();
        System.out.print("How many columns do you want --> ");
        int totalNoOfColumns = sc.nextInt();

        int[][] tables = new int[totalNoOfRows][totalNoOfColumns];

        // reading input and adding to array
        System.out.println("Enter Values:");
        for (int i = 0; i < totalNoOfRows; i++) {
            for (int j = 0; j < totalNoOfColumns; j++) {
                tables[i][j] =sc.nextInt();
            }
        }

        // reading data row-wise
        System.out.println(" Read Data Row Wise ---->");
        for (int i = 0; i < totalNoOfRows; i++) {
            int count = 0;
            for (int j = 0; j < totalNoOfColumns; j++) {
                System.out.print(tables[i][j] + " ");
            }
            System.out.println();
        }

        // reading data column-wise
        System.out.println(" Read Data Column Wise ---->");
        for (int j = 0; j < totalNoOfColumns; j++) {
            for (int i = 0; i < totalNoOfRows; i++) {
                System.out.print(tables[i][j] + " ");
            }
            System.out.println();
        }
    }
}
