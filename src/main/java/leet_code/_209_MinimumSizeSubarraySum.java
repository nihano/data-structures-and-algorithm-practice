//package leet_code;
//
//class _209_MinimumSizeSubarraySum {
//    public static int minSubArrayLen(int target, int[] nums) {
//        int currentSum=0;
//        int minSize=Integer.MAX_VALUE;
//        int start=0;
//
//
//        for(int end=0;  end<nums.length; end++){
//            currentSum+= nums[end];
//
//            while(currentSum>=target){
//                minSize = Math.min(minSize, end-start+1);
//                currentSum-=nums[start];
//                start++;
//            }
//        }
//        if (minSize==Integer.MAX_VALUE) return 0;
//        return minSize;
//    }
//
//    public static void main(String[] args) {
//        int target =7;
//        int[] nums = new int[]{2,3,1,2,4,3};
//        System.out.println(minSubArrayLen(target, nums));
//    }
//
//    public static int subArrauk
//}