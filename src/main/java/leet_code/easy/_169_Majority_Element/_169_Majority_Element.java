package leet_code.easy._169_Majority_Element;

import java.util.Arrays;

public class _169_Majority_Element {


    public static void main(String[] args) {

        int[] nums = {-1, 1, 1, 1, 2, 1};
        //-1,1,1,1,1,2
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {

        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}


