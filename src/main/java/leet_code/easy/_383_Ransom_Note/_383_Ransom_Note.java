package leet_code.easy._383_Ransom_Note;

import java.util.HashMap;
import java.util.Map;

class _383_Ransom_Note {
    public static void main(String[] args) {
        String ransomNote = "ab";
        String magazine = "aa";
        System.out.println(canConstruct(ransomNote, magazine));

    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            if (!map.containsKey(magazine.charAt(i))) {
                map.put(magazine.charAt(i), 1);
            } else {
                map.put(magazine.charAt(i), map.get(magazine.charAt(i)) + 1);
            }
        }

        int count = 0;
        for (int i = 0; i < ransomNote.length(); i++) {
            if (map.containsKey(ransomNote.charAt(i))) {
                if (map.get(ransomNote.charAt(i)) >= 1) {
                    map.put(ransomNote.charAt(i), (map.get(ransomNote.charAt(i)) - 1));
                    count++;
                }
            }
        }
        return count == ransomNote.length();
    }
}