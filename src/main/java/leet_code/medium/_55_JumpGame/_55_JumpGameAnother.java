package leet_code.medium._55_JumpGame;

public class _55_JumpGameAnother {

    public static boolean canJump(int[] nums) {
        int n = nums.length;
        int maxReachable = 0;

        for (int i = 0; i < n; i++) {
            // Update the maximum reachable index
            maxReachable = Math.max(maxReachable, i + nums[i]);

            // If the maximum reachable index is greater than or equal to the last index, return true
            if (maxReachable >= n - 1) {
                return true;
            }

            // If the current index becomes greater than the maximum reachable index, it means we can't proceed further
            if (i >= maxReachable) {
                return false;
            }
        }

        // If the loop completes without reaching the last index, return false
        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = {3,0,2,0,4};
        System.out.println(canJump(nums1)); // Output: true

        int[] nums2 = {3, 2, 1, 0, 4};
        System.out.println(canJump(nums2)); // Output: false
    }
}
