package leet_code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCommonCharacters {
    public static void main(String[] args) {
        String[] A = new String[]{"bella", "label", "roller"};
        System.out.println(commonChars(A));
    }

    public static List<String> commonChars(String[] A) {

        List<String> common_chars = new ArrayList<>();
        int[] min_frequencies = new int[26];
        Arrays.fill(min_frequencies, Integer.MAX_VALUE);
        for (String current_string : A) {
            int[] char_frequencies = new int[26];
            for (char c : current_string.toCharArray()) {
                char_frequencies[c - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                min_frequencies[i] = Math.min(min_frequencies[i], char_frequencies[i]);
            }
        }
        for (int i = 0; i < 26; i++) {
            while (min_frequencies[i] > 0) {
                common_chars.add("" + (char) (i + 'a'));
                min_frequencies[i]--;
            }

        }
        return common_chars;
    }

}
