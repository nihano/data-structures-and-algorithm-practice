package random.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithKDistinctChars{

        public static int longestSubstring(String input, int k) {
            if (input.length() == 0 || k == 0) {
                return 0;
            }

            int startIdx = 0;
            int endIdx = 0;
            Map<Character, Integer> seen = new HashMap<>();
            int result = 0;

//            Expanding the window
            while (endIdx < input.length()) {
                if (!seen.containsKey(input.charAt(endIdx))) {
                    k--;
                }
                seen.put(input.charAt(endIdx), endIdx);

//                Shrinking the window
                while (k < 0) {
                    if (seen.get(input.charAt(startIdx)) == startIdx) {
                        k++;
                        seen.remove(input.charAt(startIdx));
                    }
                    startIdx++;
                }

                result = Math.max(result, endIdx - startIdx + 1);
                endIdx++;
            }

            return result;
        }

        public static void main(String[] args) {
//          Given a string, find the length of the longest substring
//          that contains at most k distinct characters.
//          Input: s = "ecebaa", k = 2 --> output : 3
//          Input: s = "aabacccac", k = 2 --> output : 6
//          Input: s = "aabacccac", k = 1 --> output : 3
            String[] inputs = {"ecebaa", "aabacccac", "aabacccac"};
            int[] conditions = {2, 2, 1};

            for (int i = 0; i < inputs.length; i++) {
                String input = inputs[i];
                int k = conditions[i];
                System.out.printf("Input: %s K: %d Output: %d%n", input, k, longestSubstring(input, k));
            }
        }
    }

