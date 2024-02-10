package leet_code.interview_prep;

import java.util.Arrays;

public class SubarraySum {
    public static int[] subarraySum(int[] array, int k) {
        //{1, 4, 20, 3, 10, 5}
        //l,r r   r  r  r
        int l = 0;
        int currentSum = 0;
        for (int r = 0; r < array.length; r++) {
            if (currentSum < k) {
                currentSum += array[r];
            }
            while (currentSum > k) {
                currentSum -= array[l];
                l++;
            }
            if (currentSum == k) {
                int[] res = new int[r - l + 1];
                for (int i = 0; i < res.length; i++) {
                    res[i] = array[l];
                    l++;

                }
                return res;
            }


        }
        return new int[]{};
    }


    public static void main(String[] args) {
        int arr[] = new int[]{1, 4, 20, 3, 10, 5};
        int k = 15;
        System.out.println(Arrays.toString(subarraySum(arr, k)));
    }


    /*
    Given an array arr[] of non-negative integers and an integer sum, find a subarray that adds to a given sum.

Note: There may be more than one subarray with sum as the given sum, print first such subarray.

Examples:

Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
Output: Sum found between indexes 2 and 4
Explanation: Sum of elements between indices 2 and 4 is 20 + 3 + 10 = 33
     */
}
