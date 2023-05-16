package com.easyone;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        boolean flag = true;
        string = string.toLowerCase();
        for(int i = 0; i < string.length()/2; i++){
            if(string.charAt(i) != string.charAt(string.length()-i-1)){
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}