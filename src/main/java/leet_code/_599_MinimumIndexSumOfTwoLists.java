package leet_code;

import java.util.*;

class _599_MinimumIndexSumOfTwoLists {
    public static void main(String[] args) {
        String[] list1 = new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = new String[]{"KFC","Shogun","Burger King"};
        System.out.println(Arrays.toString(findRestaurant(list1, list2)));
    }

    public static String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        int indexSumMin = Integer.MAX_VALUE;
        List<String> res = new ArrayList<>();
        for (int j = 0; j < list2.length; j++) {
            if (map.containsKey(list2[j])) {
                if (map.get(list2[j]) + j < indexSumMin) {
                    res.clear();
                    res.add(list2[j]);
                    indexSumMin = map.get(list2[j]) + j;
                } else if (map.get(list2[j]) + j == indexSumMin) {
                    res.add(list2[j]);
                }
            }
        }

        return res.toArray(new String[0]);

    }
}