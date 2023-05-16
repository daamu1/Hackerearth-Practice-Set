package com.easyone;

import java.util.Scanner;

public class LifeTheUniverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
boolean check=true;
        while (check) {
            number = scanner.nextInt();

            if (number == 42) {
                break;
            }

            System.out.println(number);
        }
    }

}
