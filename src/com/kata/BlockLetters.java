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
        switch (ch) {
            case 'A': case 'a': return "  AA  \n A  A \nAAAAA\nA    A\nA    A";
            case 'B': case 'b': return "BBBB \nB   B\nBBBB \nB   B\nBBBB ";
            case 'C': case 'c': return "CCCCC\nC    \nC    \nC    \nCCCCC";
            case 'D': case 'd': return "DDDD \nD   D\nD   D\nD   D\nDDDD ";
            case 'E': case 'e': return "EEEEE\nE    \nEEE  \nE    \nEEEEE";
            case 'F': case 'f': return "FFFFF\nF    \nFFF  \nF    \nF    ";
            case 'G': case 'g': return " GGG \nG    \nG  GG\nG   G\n GGG ";
            case 'H': case 'h': return "H   H\nH   H\nHHHHH\nH   H\nH   H";
            case 'I': case 'i': return "IIIII\n  I  \n  I  \n  I  \nIIIII";
            case 'J': case 'j': return "JJJJJ\n   J \n   J \nJ  J \n JJ  ";
            case 'K': case 'k': return "K   K\nK  K \nKK   \nK  K \nK   K";
            case 'L': case 'l': return "L    \nL    \nL    \nL    \nLLLLL";
            case 'M': case 'm': return "M   M\nMM MM\nM M M\nM   M\nM   M";
            case 'N': case 'n': return "N   N\nNN  N\nN N N\nN  NN\nN   N";
            case 'O': case 'o': return " OOO \nO   O\nO   O\nO   O\n OOO ";
            case 'P': case 'p': return "PPPPP\nP   P\nPPPPP\nP    \nP    ";
            case 'Q': case 'q': return " QQQ \nQ   Q\nQ Q Q\nQ  QQ\n QQ Q";
            case 'R': case 'r': return "RRRR \nR   R\nRRRR \nR  R \nR   R";
            case 'S': case 's': return " SSS \nS    \n SSS \n    S\nSSS  ";
            case 'T': case 't': return "TTTTT\n  T  \n  T  \n  T  \n  T  ";
            case 'U': case 'u': return "U   U\nU   U\nU   U\nU   U\n UUU ";
            case 'V': case 'v': return "V   V\nV   V\nV   V\n V V \n  V  ";
            case 'W': case 'w': return "W   W\nW   W\nW W W\nWW WW\nW   W";
            case 'X': case 'x': return "X   X\n X X \n  X  \n X X \nX   X";
            case 'Y': case 'y': return "Y   Y\n Y Y \n  Y  \n  Y  \n  Y  ";
            case 'Z': case 'z': return "ZZZZZ\n   Z \n  Z  \n Z   \nZZZZZ";
            case ' ': return "     \n     \n     \n     \n     ";
            default: return "     \n     \n     \n     \n     ";
        }
    }


    public static void main(String[] args) {
        // Test the function
        String input = "Hello World";
        String blockLetters = blockLetters(input);
        System.out.println(blockLetters);
    }
}
