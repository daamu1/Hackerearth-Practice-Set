package com.easyone;

import java.util.Scanner;

public class RoyProfilePicture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Minimum dimension of the p1icture -");
        int minimumDimension = scanner.nextInt();
        System.out.print("Enter Total no of picture -");
        int totalNoPhotos = scanner.nextInt();

        for (int i = 0; i < totalNoPhotos; i++) {
            System.out.print("Width of the picture -");
            int width = scanner.nextInt();
            System.out.print("Height of the picture -");
            int height = scanner.nextInt();
            {
                if (width < minimumDimension || height < minimumDimension ) {
                    System.out.println("UPLOAD ANOTHER");
                } else {
                    if (height==width)
                    {
                        System.out.println("ACCEPTED");
                    } else {
                        System.out.println("CROP IT");
                    }
                }
            }
        }
    }
}






