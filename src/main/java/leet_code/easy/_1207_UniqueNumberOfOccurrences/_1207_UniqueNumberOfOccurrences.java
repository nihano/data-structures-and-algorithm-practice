package leet_code.easy._1207_UniqueNumberOfOccurrences;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _1207_UniqueNumberOfOccurrences {

    public static void main(String[] args) {
        int[] arr = new int[]{1};
        System.out.println(uniqueOccurrences(arr));
    }

//Unique number of occurrences
    public static boolean uniqueOccurrences(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        for (int each : arr) {
            if (!map.containsKey(each)){
                map.put(each, 1);
            }else {
                map.put(each, map.get(each)+1);
            }
        }

        Set<Integer> set = new HashSet<>();
        for (Integer value : map.values()) {
            if (!set.add(value)){
                return false;
            }
        }
        return true;
    }
}
