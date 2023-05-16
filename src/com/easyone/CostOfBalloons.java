package com.easyone;

import java.util.Scanner;

public class CostOfBalloons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cost1;
        int cost2;
        int numberOfPerticipent;
        int perticpentSolvedFirstQuestion = 0;
        int perticpentSolvedSecondQuestion = 0;
        int testCase;
        testCase = scanner.nextInt();
        if (testCase < 1 || testCase > 10) {
            System.exit(0);
        }
        for (int i = 0; i < testCase; i++) {
            cost1 = scanner.nextInt();
            cost2 = scanner.nextInt();
            numberOfPerticipent = scanner.nextInt();

            if (numberOfPerticipent < 1 || numberOfPerticipent > 10) {
                System.exit(0);
            }
            perticpentSolvedFirstQuestion = 0;
            perticpentSolvedSecondQuestion = 0;
            for (int j = 0; j < numberOfPerticipent; j++) {
                if (scanner.nextInt() == 1) {
                    perticpentSolvedFirstQuestion++;
                }
                if (scanner.nextInt() == 1) {
                    perticpentSolvedSecondQuestion++;
                }

            }
            int price1 = cost1 * perticpentSolvedFirstQuestion + cost2 * perticpentSolvedSecondQuestion;
            int price2 = cost2 * perticpentSolvedFirstQuestion + cost1 * perticpentSolvedSecondQuestion;
            System.out.println(Math.min(price2, price1));
        }

    }
}