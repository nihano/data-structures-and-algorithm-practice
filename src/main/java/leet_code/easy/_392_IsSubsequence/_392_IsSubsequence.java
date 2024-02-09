package leet_code.easy._392_IsSubsequence;

class _392_IsSubsequence {
    public static void main(String[] args) {

        String s=""; //0 1 2
        String t="ahbgdc"; //0 3 5
        System.out.println(isSubsequence(s, t));
    }
    public static boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        while (i<s.length() && j<t.length()){
            if (s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
            return i==s.length();
    }

}