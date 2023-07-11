package mentor_sessions.week34;

import java.util.*;

public class FreqOfWords {
    public static void main(String[] args) {
        String text = "   This is an example of example example  ";

        System.out.println(frequencyOfEachWord(text));
    }

    public static Map frequencyOfEachWord(String text) {
        String[] arr = text.trim().split(" ");
        Map<String, Integer> map = new HashMap<>();

        for (String each : arr) {
            if (!map.containsKey(each)) {
                map.put(each, 1);
            } else {
                map.put(each, map.get(each) + 1);
            }
        }

        return map;


    }


}


