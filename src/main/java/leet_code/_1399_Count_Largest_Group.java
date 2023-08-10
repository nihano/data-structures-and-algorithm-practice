package leet_code;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class _1399_Count_Largest_Group {


    public static void main(String[] args) {
        int n = 136;
        System.out.println(countLargestGroup(n));
    }

    public static int countLargestGroup(int n) {
        //1,2,3, 24,....9999, 10000
        //[sum of digits, frequency]
        HashMap<Integer, Integer> map = new HashMap<>();
        Set<Integer> check = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            int sumOfDigits = sumOfDigitsIterative(i);
            check.add(sumOfDigits);
            if (map.containsKey(sumOfDigits)) {
                map.put(sumOfDigits, (map.get(sumOfDigits) + 1));
            } else {
                map.put(sumOfDigits, 1);
            }

        }

        System.out.println("Total " + check.size() + " groups: " + check);
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

    public static int sumOfDigitsIterative(int n) {
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }

}
