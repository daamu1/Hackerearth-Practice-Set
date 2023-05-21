package com.easyone;

import java.util.Scanner;

public class AliAndHelpingInnocentPeople {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String truckNo = input.toUpperCase();
        int l = truckNo.length();
        boolean isValid = true;
        if (l < 1 || l > 9) {
            System.exit(0);
        }
        int i = 2;
        char c = truckNo.charAt(i);
        if (i == 2) {
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'Y') {
                isValid = false;
            }
        }  if ((Character.getNumericValue(truckNo.charAt(0)) + Character.getNumericValue(truckNo.charAt(1))) % 2 != 0) {
            isValid = false;
        } if  (((Character.getNumericValue(truckNo.charAt(3)) + Character.getNumericValue(truckNo.charAt(4))) % 2 != 0)) {
            isValid = false;
        }
        if ((Character.getNumericValue(truckNo.charAt(4)) + Character.getNumericValue(truckNo.charAt(5))) % 2 != 0) {
            isValid = false;
        }
        if ((Character.getNumericValue(truckNo.charAt(7)) + Character.getNumericValue(truckNo.charAt(8))) % 2 != 0) {
            isValid = false;
        }


        if (!isValid) {
            System.out.println("invalid");
        } else {
            System.out.println("valid");
        }
    }
}

