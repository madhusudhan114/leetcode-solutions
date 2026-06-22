package HashMapSolutions;

//First Unique Character in a String (LeetCode #387)
//The Problem: Given a string, find the first non-repeating character in it and return its index. If it doesn't exist, return -1.

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    public static int findFirstNonRepeatingCharacter(String s) {
        if (s == null || s.isEmpty()) return -1;

        Map<Character, Integer> charCounts = new HashMap<>();

        // Pass 1: Build frequency map without allocating a temporary char array
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        // Pass 2: Find the first character with a count of exactly 1
        for (int i = 0; i < s.length(); i++) {
            Integer count = charCounts.get(s.charAt(i));
            if (count != null && count == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String s = "mmaaddhhuu";
        int index = findFirstNonRepeatingCharacter(s);
        System.out.println(index);
    }
}
