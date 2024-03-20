package com.kata;

public class ValidParentheses {
    public boolean isValid(String s) {
        int countOpenParentheses = 0;
        int countOpenBrackets = 0;
        int countOpenBraces = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                countOpenParentheses++;
            } else if (c == '[') {
                countOpenBrackets++;
            } else if (c == '{') {
                countOpenBraces++;
            } else if (c == ')') {
                if (countOpenParentheses == 0) {
                    return false;
                }
                countOpenParentheses--;
            } else if (c == ']') {
                if (countOpenBrackets == 0) {
                    return false;
                }
                countOpenBrackets--;
            } else if (c == '}') {
                if (countOpenBraces == 0) {
                    return false;
                }
                countOpenBraces--;
            }
        }

        return countOpenParentheses == 0 && countOpenBrackets == 0 && countOpenBraces == 0;
    }

}

