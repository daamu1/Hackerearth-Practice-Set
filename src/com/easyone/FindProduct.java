package com.easyone;

import java.util.Scanner;

public class FindProduct {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //total no of element
        int totalNoElement=scanner.nextInt();
        int[] numbers=new int[totalNoElement];
        int[] numbers2=new int[totalNoElement];
        if(totalNoElement<1||totalNoElement>Math.pow(10, 3))
        {
            System.exit(0);
        }
        //read  input
        for (int i=0;i<numbers.length;i++)
        {
            numbers[i]=scanner.nextInt();
        }
        int sum=0;
        //logic
        for (int i=0;i<numbers.length;i++)
        {
            int value2=numbers[i];
            int value= (int) (numbers[i-1]*numbers[i] %(Math.pow(10,3)+7));
            numbers2[i]=value;
        }
        System.out.println(sum);
        System.out.println("---->");

        for (int i=0;i<numbers2.length;i++)
        {
            sum+=numbers2[i];
        }
        System.out.println(sum);
    }
}
