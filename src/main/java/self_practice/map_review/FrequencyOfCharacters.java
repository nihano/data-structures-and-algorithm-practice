package self_practice.map_review;

import java.util.*;

public class FrequencyOfCharacters {

    public static void main(String[] args) {
        String str = "bbccccaaaaa";

        System.out.println(freqOfChars(str));
    }

    public static Map<Character, Integer> freqOfChars(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        //find the frequency of each string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!map.containsKey(ch)){
                map.put(ch, 1);
            }else {
                map.replace(ch, map.get(ch)+1);
            }


        }

        return map;
    }


//    public static Map<Character, Integer> freqOfChars(String str) {
//        Map<Character, Integer> map = new LinkedHashMap<>();
//
//        for (String each : str.split("")) {
//            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);
//            map.put(each.charAt(0), frequency);
//        }
//        return map;
//    }


}
