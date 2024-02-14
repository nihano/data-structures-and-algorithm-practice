package leet_code.easy._205_IsomorphicString;

import java.util.Arrays;

class Solution {
    public static boolean isIsomorphic(String s, String t) {
        int[] map = new int[256];
        for (int i = 0; i < s.length(); i++) {
            if (map[s.charAt(i)] == 0) {
                for (int j = 0; j < map.length; j++) {
                    if (map[j] == t.charAt(i)) {
                        return false;
                    }
                }
                map[s.charAt(i)] = t.charAt(i);
            } else if (map[s.charAt(i)] != t.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abcd";
        String t = "abad";
        System.out.println(isIsomorphic(s, t));


    }
}