package leet_code;

import java.util.Arrays;

public class LargestPerimeterTriangle {

    public static void main(String[] args) {
        int[] arr = new int[]{3,6,2,3};
        System.out.println(largestPerimeter(arr));
    }

    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int a;
        int b;
        int c;
        int perimeter = 0;
        int max = 0;
        for (int i = nums.length - 1; i > 1; i--) {
            a = nums[i];
            b = nums[i - 1];
            c = nums[i - 2];
            if (a + b > c && a + c > b && b + c > a) {
                perimeter = a + b + c;
                if (perimeter > max) {
                    max = perimeter;
                }
            }
        }

        return max;

    }

}


