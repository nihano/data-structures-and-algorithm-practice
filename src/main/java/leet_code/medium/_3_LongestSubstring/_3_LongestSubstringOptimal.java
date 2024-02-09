package leet_code.medium._3_LongestSubstring;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class _3_LongestSubstringOptimal {
    public static void main(String[] args) {
        String s = "pjbbb";
        System.out.println(lengthOfLongestSubstring(s));
    }


    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> visitedChars = new HashMap<>();
        int maxLength=0;
        for (int right = 0, left=0; right < s.length(); right++) {
            char currentCh = s.charAt(right);
            if (visitedChars.containsKey(currentCh)
                    && visitedChars.get(currentCh)>=left){
                left=visitedChars.get(currentCh)+1;
            }
            maxLength= Math.max(maxLength, right-left+1);
            visitedChars.put(currentCh,right);
        }
        return maxLength;
    }

}
