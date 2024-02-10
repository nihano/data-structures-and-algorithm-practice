package random.slidingWindow;

public class SmallestSubarrayWithTargetSum {

    public static void main(String[] args) {
        int[] nums = new int[]{4, 2, 2, 7, 8, 1, 2, 8, 10};
        System.out.println(smallestSubarray(nums, 8));

    }

    public static int smallestSubarray(int[] nums, int target) {
        int currentSum = 0;
        int smallestSize = Integer.MAX_VALUE;
        int indexBeg = 0;

        for (int indexEnd = 0; indexEnd < nums.length; indexEnd++) {
            currentSum += nums[indexEnd];
            while (currentSum >= target) {
                smallestSize=Math.min(smallestSize, indexEnd-indexBeg+1);
                currentSum-=nums[indexBeg];
                indexBeg++;
            }
        }


        return smallestSize;
    }
}

