package com.kata;

public class Dinglemouse {

    public static String fireAndFury(final String tweet) {
        int fireCount = 0;
        int furyCount = 0;
        StringBuilder finalString = new StringBuilder();
        for (int i = 0; i < tweet.length(); i++) {
            if (i + 4 > tweet.length()) {
                break;
            }
            if (tweet.substring(i, i + 4).equals("FURY")) {
                furyCount++;
            } else if (tweet.substring(i, i + 4).equals("FIRE")) {
                fireCount++;
            }
        }
        if (fireCount != 0) {
            switch (fireCount) {
                case 1:
                    finalString.append("You are fired!");
                case 2:
                    finalString.append("You and you are fired!");
                case 3:
                    finalString.append("You and you and you are fired!");
            }
        } else if (furyCount != 0) {
            switch (furyCount) {
                case 1:
                    finalString.append("I am furious.");
                case 2:
                    finalString.append("I am really furious.");
                case 3:
                    finalString.append("I am really really furious.");
            }
        } else {
            finalString.append("Fake tweet.");
        }
        return finalString.toString();
    }

}