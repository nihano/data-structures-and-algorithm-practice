package random.twoPointers;

import java.util.Arrays;

public class TwoSumSorted {
    public static void main(String[] args) {
        int[] arr = new int[]{3,24,50,79,88,150,345};
        int target =200;
        System.out.println(Arrays.toString(twoSumSorted(arr, target)));
    }
    public static int[] twoSumSorted(int[] arr, int target){
        int slow=0;
        int fast=arr.length-1;
        while (fast>0){

            if (arr[slow]+arr[fast]<target){
                slow++;
            }else if (arr[slow]+arr[fast]>target) {
                fast--;
            } else {
                return new int[]{slow, fast};
            }
        }

        return new int[]{};
    }
    /*
    Given an array of integers sorted in ascending order,
    find two numbers that add up to a given target.
    Return the indices of the two numbers in ascending order.
    You can assume elements in the array are unique
    and there is only one solution. Do this in O(n) time and with constant auxiliary space.
Input:
arr: a sorted integer array
target: the target sum we want to reach
Sample Input: [2 3 4 5 8 11 18], 8

Sample Output: 1 3
     */
}
