package leet_code.easy._205_IsomorphicString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Isomorphic {
    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char chS = s.charAt(i);
            char chT = t.charAt(i);
            if (!map.containsKey(chS)) {
                if (map.containsValue(chT)) {
                    return false;
                }
                map.put(chS, chT);
            } else {
                if (map.get(chS) != chT) {
                    return false;
                }
            }
        }

        return true;

    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("abcd", "abad"));


    }
}
