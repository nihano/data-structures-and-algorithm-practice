package self_practice.map_review;

import java.util.*;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "aabcccdeeeef";
        System.out.println(uniqueCharacters(str));
    }

    public static Map<Character, Integer> uniqueCharacters(String str){

        Map<Character, Integer> map = new LinkedHashMap<>();
        String[] stringArray = str.split("");
        for (String each : stringArray) {
            int frequency = Collections.frequency(Arrays.asList(stringArray), each);
            if (frequency==1){
                map.put(each.charAt(0), frequency);
            }
        }
        return map;
    }
}
