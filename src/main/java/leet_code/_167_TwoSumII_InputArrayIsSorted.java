package leet_code;

import java.util.Arrays;

public class _167_TwoSumII_InputArrayIsSorted {
    public static int[] twoSum(int[] numbers, int target) {
        int slow = 0;
        int fast = numbers.length - 1;
        while (fast > 0) {

            if (numbers[slow] + numbers[fast] < target) {
                slow++;
            } else if (numbers[slow] + numbers[fast] > target) {
                fast--;
            } else {
                return new int[]{slow + 1, fast + 1};
            }
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{2,7,11,15};
        int target=9;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }
}

