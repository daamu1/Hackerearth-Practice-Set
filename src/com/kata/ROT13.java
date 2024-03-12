package com.kata;

public class ROT13 {
    public static void main(String[] args) {
        String encrypted = rot13("anmol sharma");
        System.out.println(encrypted);
        char a = 'a';
        char n = 'n';

        System.out.println(a + n);
    }

    public static String rot13(String message) {
        StringBuilder rot13 = new StringBuilder();

        for (char ch : message.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (Character.isUpperCase(ch)) {
                    rot13.append(rotateCharacter(ch, 'A', 13));
                } else {
                    rot13.append(rotateCharacter(ch, 'a', 13));
                }
            } else {
                rot13.append(ch);
            }
        }

        return rot13.toString();
    }


    private static char rotateCharacter(char ch, char base, int offset) {
        if (!Character.isLetter(ch) || ch == 'ä' || ch == 'ö' || ch == 'ü') {
            return ch;
        }

        return (char) (((ch - base + offset) % 26) + base);
    }
}
