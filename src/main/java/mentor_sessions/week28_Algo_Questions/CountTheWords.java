package mentor_sessions.week28_Algo_Questions;

import java.util.HashMap;
import java.util.Map;

public class CountTheWords {

    public static void main(String[] args) {

        String word = "     'This'    is an example! of example example, example    ";
        String newWord = word.replaceAll("[^a-zA-Z\\s]", "");
        String[] arr = newWord.split(" ");
        Map<String, Integer> map = new HashMap<>();

        for (String each : arr) {
            Integer count = 0;
            if (!each.equals("")) {
                if (!map.containsKey(each)) {
                    count++;
                    map.put(each, count);
                } else {
                    Integer count2 = map.get(each);
                    map.replace(each, count2+1);
                }
            }
        }

        System.out.println(map);

    }
}
