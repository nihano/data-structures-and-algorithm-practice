package random;

import java.util.*;


public class CardinalitySorting {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4);

        List<Integer> binaryCounts = new ArrayList<>();
        for (Integer num : nums) {
            binaryCounts.add(countBinaryOnes(num));
        }
        System.out.println(binaryCounts);

        System.out.println(cardinalitySort(nums));

    }

    public static List<Integer> cardinalitySort(List<Integer> nums){


        nums.sort(Comparator
                .comparingInt((Integer num) -> countBinaryOnes(num))
                .thenComparingInt(num -> num));

        return nums;
    }

    private static int countBinaryOnes(int num){
        String s = Integer.toBinaryString(num);

        char[] ch = s.toCharArray();
        Integer countOne = 0;
        for (int i = 0; i < ch.length; i++) {

            if (ch[i]=='1') countOne++;

        }

        return countOne;
    }
}
