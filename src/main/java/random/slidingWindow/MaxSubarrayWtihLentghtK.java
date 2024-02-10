package random.slidingWindow;

import java.util.Enumeration;

public class MaxSubarrayWtihLentghtK {

    public static void main(String[] args) {
        int[] nums = new int[]{4,2,1,7,8,1,2,8,1,0};
        //                     0 1 2 3 4 5 6 7 8 9
        int k=10;
        System.out.println(maxSum(nums, k));
    }

    public static int maxSum(int[] nums, int k){
        int slow=0;
        int fast=0;
        int currentSum=0;
        int max=Integer.MIN_VALUE;
        while (fast< nums.length){
            if (fast-slow+1<=k){
                currentSum+=nums[fast];
                fast++;
                max=Math.max(currentSum, max);
            } else if (fast-slow+1>k) {
                currentSum-=nums[slow];
                slow++;
            }
        }
        return max;
    }
}
