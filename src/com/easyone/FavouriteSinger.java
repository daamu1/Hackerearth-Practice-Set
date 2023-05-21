package com.easyone;
import java.util.*;

public class FavouriteSinger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int playListSize = scanner.nextInt();
        if (playListSize < 0 || playListSize > 2 * Math.pow(10, 5)) {
            System.exit(0);
        }
        //Take input
        long[] playList = new long[playListSize];
        Map<Long, Integer> keyValues = new HashMap<>();
        int maxCount = 0;
        for (int i = 0; i < playList.length; i++) {
            playList[i] = scanner.nextLong();
            if (playList[i] < 0 || playList[i] > Math.pow(10, 15)) {
                System.exit(0);
            }
            int count = keyValues.getOrDefault(playList[i], 0) + 1;
            keyValues.put(playList[i], count);
            maxCount = Math.max(maxCount, count);
        }
        List<Map.Entry<Long, Integer>> entryList = new ArrayList<>(keyValues.entrySet());

        // Find the maximum value using Collections.max() and a custom comparator
        Map.Entry<Long, Integer> maxEntry = Collections.max(entryList, Map.Entry.comparingByValue());

        System.out.println(keyValues);
        // Count the number of keys that have the maximum value
        int count = 0;
        for (Map.Entry<Long, Integer> entry : keyValues.entrySet()) {
            if (entry.getValue() == maxCount) {
                count++;
            }
        }

        System.out.println(count);
    }
}

