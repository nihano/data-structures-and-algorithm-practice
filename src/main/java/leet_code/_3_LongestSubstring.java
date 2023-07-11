package leet_code;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _3_LongestSubstring {
    //Question:
    /*
Given a string s, find the length of the longest
substring without repeating characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.
     */
    public static void main(String[] args) {
        String s = "";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {

        LinkedHashSet<Character> set = new LinkedHashSet<>();
        LinkedHashSet<Character> set2 = new LinkedHashSet<>();
        int i = 0;
        int j = i + 1;

        if(s.isEmpty()) return 0;
        while (i < s.length()) {
            char ch = s.charAt(i);
            if (set.add(ch)) { //ab
                i++;
            } else {
                if (set.size() > set2.size()) {
                    set2.clear();
                    set2.addAll(set); //ab
                }
                set.clear();
                i = j;
                j++;
            }
        }
        if (set.size()==s.length()) {
            System.out.println(set);
            return set.size();
        }
        return Math.max(set2.size(), set.size());

    }


}
