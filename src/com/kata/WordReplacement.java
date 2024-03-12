package com.kata;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WordReplacement {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ravi");
        names.add("Ram");
        names.add("abcd");
        names.add("Shyam");
        System.out.println(getExtendedNames(names).toString());

    }

    static List<String> getExtendedNames(List<String> names) {
        List<String> extendedNames = new ArrayList<>();
        for (String name : names) {
            final var length = name.length();
            if (length <= 20) {
                var neededLength = 20 - name.length();
                extendedNames.add(name + String.valueOf(generateRandomCharacters(neededLength)));
            } else {
                extendedNames.add(name);
            }
        }
        return extendedNames;
    }

    static char[] generateRandomCharacters(int length) {
        char[] characters = new char[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            characters[i] = (char) ('a' + random.nextInt(26));
        }
        return characters;
    }
}
