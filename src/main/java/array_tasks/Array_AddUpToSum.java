package array_tasks;

import java.util.*;

public class Array_AddUpToSum {

    public static void main(String[] args) {

        int[] arr = {8, 7, 2, 5, 3, 1};
        int sum = 10;
        System.out.println(addUpToSum(arr, sum));

    }

    public static Map<Integer, Integer> addUpToSum(int[] arr, int sum){
        Map<Integer, Integer> pairs = new LinkedHashMap<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    pairs.put(arr[i], arr[j]);
                }
            }
        }
        return pairs;
    }
}
     /*
     given an int[] 'arr' and another int 'sum',
     Write a function which can find a pair of ints in 'arr' that add up to 'sum'.
        Example:
            arr = [8, 7, 2, 5, 3, 1]
            sum = 10
            Output:
                {8=2, 7=3}
     */
