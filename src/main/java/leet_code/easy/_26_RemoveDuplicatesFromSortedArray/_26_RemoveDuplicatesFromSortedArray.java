package leet_code.easy._26_RemoveDuplicatesFromSortedArray;

import java.util.Arrays;

class _26_RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums={1,2,2,3,3,5,6,6};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int slow=0;
        int fast=0;
        while(fast<nums.length){
            if(nums[fast]>nums[slow]){
                nums[slow+1]=nums[fast];
            slow++;
            }
             fast++;
        }
        return slow+1;

       
    }
}