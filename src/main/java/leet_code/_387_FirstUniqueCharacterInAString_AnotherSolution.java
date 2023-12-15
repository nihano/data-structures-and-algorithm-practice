package leet_code;

public class _387_FirstUniqueCharacterInAString_AnotherSolution {
    public static void main(String[] args) {
        String s ="leetcode";
        System.out.println(firsNonUnique(s));
    }

    public  static int firsNonUnique(String s){
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)-'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
}
