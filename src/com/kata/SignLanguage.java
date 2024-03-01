package com.kata;

import java.util.HashSet;
import java.util.Set;

public class SignLanguage {
    public static boolean gaslighting(String shirtWord, String yourWord, char[] friendsLetters) {

        for (int i = 0; i < shirtWord.length(); i++) {
            char shirtLetter = shirtWord.charAt(i);
            char yourLetter = yourWord.charAt(i);

            if (shirtLetter != yourLetter) {
                // I told him wrong character. check if he knows it
                for (char friendsLetter : friendsLetters) {
                    if ((friendsLetter == shirtLetter) || (friendsLetter == yourLetter)) {
                        // Friend can recognize this letter and he founds that I lied
                        return true;
                    }
                }
            }
        }

        // Friend does not know that I am fooling him
        return false;
    }
}
