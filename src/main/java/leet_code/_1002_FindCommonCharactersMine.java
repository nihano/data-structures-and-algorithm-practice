package leet_code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _1002_FindCommonCharactersMine {

    public static void main(String[] args) {
        String[] words = new String[]{"cool","lock","cook"};
        System.out.println(commonChars(words));
    }
    public static List<String> commonChars(String[] words) {

        List<String> commonChars = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 'a'; i <= 'z'; i++) {
            map.put((char) i, Integer.MAX_VALUE);
        }
        for (String word : words) {
            Map<Character, Integer> chMap = new HashMap<>();
            for (int i = 'a'; i <= 'z'; i++) {
                chMap.put((char) i, 0);
            }
            for (char ch : word.toCharArray()) {
                if (chMap.containsKey(ch)) {
                    chMap.put(ch, chMap.get(ch) + 1);
                } else {
                    chMap.put(ch, 1);
                }
            }

            for (int i = 'a'; i <= 'z'; i++) {
                if (chMap.get((char) i) <= map.get((char) i)) {
                    map.replace((char) i, chMap.get((char) i));
                }
            }
        }
        for (int i = 'a'; i <= 'z'; i++) {
            if (map.get((char) i) > 0) {
                commonChars.add((char) i + "");
                map.replace((char) i, map.get((char) i) - 1);
                i--;
            }
        }
        return commonChars;

    }

}
