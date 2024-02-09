package leet_code.medium._80_RemoveDuplicatesFromSortedArrayII;

import java.util.Arrays;
import java.util.List;

public class _80_RemoveDuplicatesFromSortedArrayII {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        System.out.println(removeDuplicates(nums));
    }
    public  static int removeDuplicates(int[] nums) {
        int l = 0, r = 0;
        while (r < nums.length) {
            int count = 1;
            while (r + 1 < nums.length && nums[r]==nums[r+1]) {
                r++;
                count++;
            }
            for (int i = 0; i < Math.min(2, count); i++) {
                nums[l]=nums[r];
                l++;
            }
            r++;
        }

        System.out.println(Arrays.toString(nums));
        return l;
    }
}
