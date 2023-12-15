package leet_code;

public class _387_FirstUniqueCharacterInAString_AnotherSolution2 {
    public static void main(String[] args) {
        String s ="leetcode";
        System.out.println(firsNonUnique(s));
    }
    public  static int firsNonUnique(String s){
        //THIS Looks like O(n2) lastIndexOf O(n)?
        int ans = Integer.MAX_VALUE;
        for(char c='a'; c<='z'; c++){
            int index=s.indexOf(c);
            if (index!=-1&& index==s.lastIndexOf(c)){
                ans = Math.min(ans, index);
            }
        }

        return  ans==Integer.MAX_VALUE?-1:ans;
    }
}
