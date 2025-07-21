package String;

import java.util.HashMap;

public class stringExample7 {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        
        if (isAnagram(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }

    static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        // Count characters in str1
        HashMap<Character, Integer> countMap = new HashMap<>();
        char[] a = str1.toCharArray();
        System.out.println(a);
        for (char c : a) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
            System.out.println(countMap);
        }

//        // Subtract counts using str2
        for (char c : str2.toCharArray()) {
            if (!countMap.containsKey(c)) return false;
            countMap.put(c, countMap.get(c) - 1);
            System.out.println(countMap);
            if (countMap.get(c) == 0) {
                countMap.remove(c);
            }
        }

        return countMap.isEmpty();
    }
}