package com.kata;

public class OutOfSpace {

    public static String[] spacey(String[] array) {
        // TODO: Figure it out :)
        String[] opArray = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j <= i; j++) {
                stringBuilder.append(array[j]);
            }
            opArray[i] = stringBuilder.toString();
            stringBuilder = null;
        }

        return opArray;
    }

}