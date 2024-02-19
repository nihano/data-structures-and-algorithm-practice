package leet_code.easy._290_WordPattern;

import java.util.HashMap;
import java.util.Map;

class _290_WordPattern {
    public static boolean wordPattern(String pattern, String s) {

        String[] str = s.split(" ");
        Map<Character, String> map = new HashMap<>();
        for(int i=0,j=0; i<str.length && j<pattern.length(); i++, j++){
           Character ch = pattern.charAt(j);
           if(!map.containsKey(ch)){
               if(map.containsValue(str[i])){
                   return false;
               }else{
                   map.put(ch, str[i]);
               }

           }else{
               if(!str[i].equals(map.get(ch))){
                   return false;
               }
           }
        }

        return true;

    }

    public static void main(String[] args) {
        String pattern ="abba";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));
    }
}