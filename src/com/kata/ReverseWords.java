package com.kata;

public class ReverseWords {
    public static String reverseWords(final String original) {
        if(original.isBlank())
        {
            return original;
        }
        String[] words = original.split(" ");

        String[] reversedWords = new String[words.length];

        for(int i = 0; i < words.length; i++) {
            String word = words[i];
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            reversedWords[i] = reversedWord.toString();
        }

        return String.join(" ", reversedWords);
    }
}
