package leet_code.easy._28_FindTheIndexOfTheFirstOccurrenceInAString;

public class _28_FindTheIndexOfTheFirstOccurrenceInAString {
    public static void main(String[] args) {
        String s= "aadasd";
        System.out.println(s.substring(0, 6));
        System.out.println(strStr("codeleet", "leet"));
    }
    public static int strStr(String haystack, String needle){
        int begin=0;
        int end=needle.length();
        while (end<=haystack.length()){
            if (haystack.substring(begin,end).equals(needle)){
                return begin;
            }else {
                begin++;
                end++;
            }
        }
        return -1;
    }
}
