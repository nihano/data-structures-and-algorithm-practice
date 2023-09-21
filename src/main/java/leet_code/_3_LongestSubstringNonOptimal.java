package leet_code;

public class _3_LongestSubstringNonOptimal {

    public static void main(String[] args) {
        String s = "paa";
        System.out.println(substring(s));

    }

    public static int substring(String s){
        String max="";
        String current="";
        int i=0;
        while (i<s.length()){
            if (!current.contains(s.charAt(i)+"")){
                current+=s.charAt(i);
                i++;
            }else{
                if (current.length()>max.length()){
                    max=current;
                }
                current="";
            }
        }
        return max.length();
    }
}
