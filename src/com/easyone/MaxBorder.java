package com.easyone;

import java.util.Scanner;

public class MaxBorder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // number of test cases
        int totalNoOfTestcase = sc.nextInt();

        while (totalNoOfTestcase != 0) {
            // number of rows
            int totalNoOfRows = sc.nextInt();
            // number of columns
            int totalNoOfColumns = sc.nextInt();
            // matrix to store value
            char[][] tables = new char[totalNoOfRows][totalNoOfColumns];

            // reading input
            for (int i = 0; i < totalNoOfRows; i++) {
                String row = sc.next();
                for (int j = 0; j < totalNoOfColumns; j++) {
                    tables[i][j] = row.charAt(j);
                }
            }
            // finding maximum hashValue
            int hashValue = 0;
            // for each row
            for (int i = 0; i < totalNoOfRows; i++) {
                // current row hashValue
                int currHashValue = 0;
                for (int j = 0; j < totalNoOfColumns; j++) {
                    if (tables[i][j] == '#') {
                        // increment current hashValue
                        currHashValue++;
                    } else {
                        // update max hashValue
                        hashValue = Math.max(hashValue, currHashValue);
                        // reset current hashValue
                        currHashValue = 0;
                    }
                }
                // update max hashValue for last cell of row
                hashValue = Math.max(hashValue, currHashValue);
                System.out.println(hashValue);

            }

//            System.out.println(hashValue);
            totalNoOfTestcase--;

        }
    }
}
