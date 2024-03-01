package com.kata;

public class BetterThanAverage {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        // Your code here
        int totalScore=0;
        for(int score:classPoints)
        {
            totalScore=totalScore+score;
        }
        int average=totalScore/classPoints.length;
        if(yourPoints>average)
        {
            return true;
        }
        else {
            return  false;
        }
    }
}
