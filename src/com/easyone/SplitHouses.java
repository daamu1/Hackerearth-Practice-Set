package com.easyone;

import java.util.Scanner;

public class SplitHouses {
    public static void main(String[] args) {
        int totalNoGrid;
        Scanner scanner = new Scanner(System.in);
        totalNoGrid = scanner.nextInt();
        if (totalNoGrid < 1 || totalNoGrid > 20) {
            System.exit(0);
        }
        String input = scanner.next();
        if (input.length() != totalNoGrid) {
            System.exit(0);
        }
        char[] grid ;

        grid = input.toCharArray();
//        System.out.println(grid);
//        if (grid.length != totalNoGrid){
//            System.out.println(grid);
//        }
////        String gridString = new String(grid).toUpperCase();
//        if (gridString.contains("HH")) {
//            System.out.println("NO");
//        } else {
//            System.out.println("YES");
//            gridString = gridString.replace('.', 'B');
//            System.out.println(gridString);
//        }
    }

}


