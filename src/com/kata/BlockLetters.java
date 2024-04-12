package com.kata;

public class BlockLetters {
    public static String blockLetters(String input) {
        input = input.trim(); // Remove leading and trailing spaces
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Determine block letters representation for the character
            String blockLetters = getBlockLetters(ch);

            // Split block letters representation into lines
            String[] lines = blockLetters.split("\n");

            // Append each line to the result with one space between characters
            for (String line : lines) {
                result.append(line).append(" ");
            }
        }

        // Remove trailing space and return the result
        return result.toString().trim();
    }


    private static String getBlockLetters(char ch) {
        // Determine the block letters representation for the character
        return switch (ch) {
            case 'A', 'a' -> "  AA  \n A  A \nAAAAA\nA    A\nA    A";
            case 'B', 'b' -> "BBBB \nB   B\nBBBB \nB   B\nBBBB ";
            case 'C', 'c' -> "CCCCC\nC    \nC    \nC    \nCCCCC";
            case 'D', 'd' -> "DDDD \nD   D\nD   D\nD   D\nDDDD ";
            case 'E', 'e' -> "EEEEE\nE    \nEEE  \nE    \nEEEEE";
            case 'F', 'f' -> "FFFFF\nF    \nFFF  \nF    \nF    ";
            case 'G', 'g' -> " GGG \nG    \nG  GG\nG   G\n GGG ";
            case 'H', 'h' -> "H   H\nH   H\nHHHHH\nH   H\nH   H";
            case 'I', 'i' -> "IIIII\n  I  \n  I  \n  I  \nIIIII";
            case 'J', 'j' -> "JJJJJ\n   J \n   J \nJ  J \n JJ  ";
            case 'K', 'k' -> "K   K\nK  K \nKK   \nK  K \nK   K";
            case 'L', 'l' -> "L    \nL    \nL    \nL    \nLLLLL";
            case 'M', 'm' -> "M   M\nMM MM\nM M M\nM   M\nM   M";
            case 'N', 'n' -> "N   N\nNN  N\nN N N\nN  NN\nN   N";
            case 'O', 'o' -> " OOO \nO   O\nO   O\nO   O\n OOO ";
            case 'P', 'p' -> "PPPPP\nP   P\nPPPPP\nP    \nP    ";
            case 'Q', 'q' -> " QQQ \nQ   Q\nQ Q Q\nQ  QQ\n QQ Q";
            case 'R', 'r' -> "RRRR \nR   R\nRRRR \nR  R \nR   R";
            case 'S', 's' -> " SSS \nS    \n SSS \n    S\nSSS  ";
            case 'T', 't' -> "TTTTT\n  T  \n  T  \n  T  \n  T  ";
            case 'U', 'u' -> "U   U\nU   U\nU   U\nU   U\n UUU ";
            case 'V', 'v' -> "V   V\nV   V\nV   V\n V V \n  V  ";
            case 'W', 'w' -> "W   W\nW   W\nW W W\nWW WW\nW   W";
            case 'X', 'x' -> "X   X\n X X \n  X  \n X X \nX   X";
            case 'Y', 'y' -> "Y   Y\n Y Y \n  Y  \n  Y  \n  Y  ";
            case 'Z', 'z' -> "ZZZZZ\n   Z \n  Z  \n Z   \nZZZZZ";
            default -> "     \n     \n     \n     \n     ";
        };
    }


    public static void main(String[] args) {
        // Test the function
        String input = "Hello World";
        String blockLetters = blockLetters(input);
        System.out.println(blockLetters);
    }
}
