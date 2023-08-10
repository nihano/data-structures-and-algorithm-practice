package leet_code;

public class _1768_Merge_Strings_Alternately {
    public static void main(String[] args) {
        String a = "abc";
        String b = "efgh";
        System.out.println(mergeAlternately(a, b));
    }
    public static String mergeAlternately(String word1, String word2) {


        String res="";
        if(word1.length()< word2.length()){
            int index=0;
            for(int i=0; i<word1.length(); i++){
                res+=word1.charAt(i)+""+word2.charAt(i)+"";
                index=i;
            }
            for(int j=index+1; j<word2.length(); j++){
                res+=word2.charAt(j)+"";
            }

        }else if(word1.length()> word2.length()){
            int index=0;
            for(int i=0; i<word2.length(); i++){
                res+=word1.charAt(i)+""+word2.charAt(i)+"";
                index=i;
            }
            for(int j=index+1; j<word1.length(); j++){
                res+=word1.charAt(j)+"";
            }
        }else{
            for(int i=0; i<word1.length(); i++){
                res+=word1.charAt(i)+""+word2.charAt(i)+"";
            }

        }
        return res;

    }
}