package leet_code;

import java.util.HashMap;

public class _1399_Count_Largest_Group {


    public static void main(String[] args) {
        int n = 13;
        System.out.println(countLargestGroup(n));
    }

    public static int countLargestGroup(int n) {
        //1,2,3, 24

        //[sum of digits, frequency]
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            int sumOfDigits = sumOfDigits(i);
            if (map.containsKey(sumOfDigits)) {
                map.put(sumOfDigits, (map.get(sumOfDigits) + 1));
            } else {
                map.put(sumOfDigits, 1);
            }
        }
        int maxFrequency = Integer.MIN_VALUE;
        for (Integer value : map.values()) {
            if (value > maxFrequency) {
                maxFrequency = value;
            }
        }

        int count = 0;
        for (Integer value : map.values()) {
            if (value == maxFrequency) {
                count++;
            }
        }

        return count;
        //loop the map find the max
        //
    }

    public static int sumOfDigits(int n) {
        //101%10=1 *
        //101/10=10

        //10%10=0 *
        //10/10=1

        //1%10=1*
        //1/10=0 ==>0
        if (n == 0) return 0;
        return n % 10 + sumOfDigits(n / 10);
    }

}
