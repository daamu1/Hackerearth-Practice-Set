package com.testing;

import java.util.Scanner;

public class StrongPasscode {
    public static void main(String[] args) {
        String password;
        Scanner scanner = new Scanner(System.in);
        password = scanner.nextLine();
        if(!isStrongPassword(password))
        {
            System.out.println("Password is not strong enough. It should contain at least 8 characters, including alphanumeric characters, special characters, and numbers.");
        }
        else
        {
            System.out.println("Password is strong..");
        }

    }

    private static boolean isStrongPassword(String password) {
// Check if the password meets the requirements for a strong password
// Minimum 8 characters, alphanumeric characters, special characters, and numbers.
        String pattern = "^(?=.*[0-9])(?=.*[a-zA-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
        return password.matches(pattern);
    }
}
