package leet_code;

import java.util.*;

public class _500_KeyboardRow {
    public static String[] findWords(String[] words) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (isOneRow(word)) {
                result.add(word);
            }
        }
        return result.toArray(new String[0]);
    }

    private static int checkRow(char ch) {
        ch = Character.toLowerCase(ch);
        if ("qwertyuiop".indexOf(ch) != -1) {
            return 1;
        } else if ("asdfghjkl".indexOf(ch) != -1) {
            return 2;
        } else if ("zxcvbnm".indexOf(ch) != -1) {
            return 3;
        }
        return 0;
    }

    private static boolean isOneRow(String s) {
        if (s.length() == 1) {
            return true;
        }
        Set<Integer> rowSet = new HashSet<>();
        rowSet.add(checkRow(s.charAt(0)));
        for (int i = 1; i < s.length(); i++) {
            if (!rowSet.contains(checkRow(s.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = new String[]{"Hello","Alaska","Dad","Peace"};
        String[] words2 = new String[]{"adsdf","sfd"};
        String[] words3 = new String[]{"omk"};
        System.out.println(Arrays.toString(findWords(words)));
        System.out.println(Arrays.toString(findWords(words2)));
        System.out.println(Arrays.toString(findWords(words3)));

    }

}