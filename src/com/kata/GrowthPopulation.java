package com.kata;

public class GrowthPopulation {

    public static int nbYear(int p0, double percent, int aug, int p) {
        // your code
        int years = 0;
        double per = percent / 100.0;

        while (p0 < p) {
            p0 += (p0 * per + aug);
            years++;
        }
        return years;
    }
}
