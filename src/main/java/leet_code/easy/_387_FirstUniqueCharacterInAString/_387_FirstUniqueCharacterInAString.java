package leet_code.easy._387_FirstUniqueCharacterInAString;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _387_FirstUniqueCharacterInAString {
    public static void main(String[] args) {

        String s = "leetcode";
        System.out.println(firstUniqChar(s));


    }



    public static int firstUniqChar(String s) {
        Set<Character> seen= new HashSet<>();
        Set<Character> repeating= new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (!seen.contains(s.charAt(i))){
                seen.add(s.charAt(i));
            }else{
                repeating.add(s.charAt(i));
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (repeating.add(s.charAt(i))){
                return i;
            }
        }
        return -1;
    }
}
