package com.kata;

public class FindNeedle {
    public static String findNeedle(Object[] haystack) {
        int position = 0;
        for (Object object : haystack) {
            if (object != null && object.equals("needle")) {
                return "found the needle at position " + position;
            }
            position++;


        }
        return "needle not found";
    }
}
