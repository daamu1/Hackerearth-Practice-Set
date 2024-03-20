package com.kata;

import java.util.HashSet;
import java.util.Set;

public class Troll {
    public static String disemvowel(String str) {
        Set<Character> vowls = new HashSet<>();
        vowls.add('A');
        vowls.add('a');
        vowls.add('E');
        vowls.add('e');
        vowls.add('I');
        vowls.add('i');
        vowls.add('O');
        vowls.add('o');
        vowls.add('U');
        vowls.add('u');
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (vowls.contains(str.charAt(i))) {
                stringBuilder.append(str.charAt(i));
            }
        }


        // Code away...
        return stringBuilder.toString();
    }
}