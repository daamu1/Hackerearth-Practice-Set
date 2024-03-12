package com.kata;

public class WillYouMake {
    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        // Your code here
        if (mpg * fuelLeft >= distanceToPump) {
            return true;
        } else {
            return false;

        }
    }

    public static int[] invert(int[] array) {
        int[] reverseArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            var i1 = array[i] * -1;
            reverseArray[i] = i1;
        }
        return reverseArray;
    }

    public static String greet(String name) {
        return String.format("Hello, %s how are you doing today?", name);
    }

    public static String[] removeRotten(String[] fruitBasket) {
        if (fruitBasket == null || fruitBasket.length <= 0) {
            return new String[0]; // No need for fruitBasket.length, just return an empty array
        }

        for (int i = 0; i < fruitBasket.length; i++) {
            if (fruitBasket[i].contains("rotten")) {
                fruitBasket[i] = fruitBasket[i].replace("rotten", ""); // Correctly replace "rotten" in the string

                // Convert first character to uppercase only if it's not already uppercase
                char firstChar = fruitBasket[i].charAt(0);
                if (Character.isUpperCase(firstChar)) {
                    fruitBasket[i] = Character.toLowerCase(firstChar) + fruitBasket[i].substring(1);
                }
            }
        }

        return fruitBasket; // Return the modified fruitBasket directly
    }


}
