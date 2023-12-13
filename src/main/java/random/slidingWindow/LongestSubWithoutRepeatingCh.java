package random.slidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubWithoutRepeatingCh {
    public static void main(String[] args) {
        String str = "pwwkew";
        System.out.println(longestSub(str));

    }

    public static int longestSub(String s) {
        int slow = 0;
        int fast=0;
        int max = Integer.MIN_VALUE;
        Set<Character> seen = new HashSet<>();
        if (s.isEmpty()) return 0;
        while (fast<s.length()){
            if (!seen.add(s.charAt(fast))){
                seen.remove(s.charAt(slow));
                slow++;
            }else{

                max=Math.max(max, fast-slow+1);
                fast++;
            }
        }
        return max;
    }
}


//        for (int fast = 0; fast < s.length(); fast++) {
//            while (!seen.add(s.charAt(fast))) {
//                seen.remove(s.charAt(slow));
//                slow++;
//
//            }
//            seen.add(s.charAt(fast));
//            max = Math.max(max, fast - slow + 1);
//        }
//        return max;

