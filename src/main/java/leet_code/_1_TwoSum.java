package leet_code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _1_TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 3,3,1};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));

    }

//    public static int[] twoSum(int[] nums, int target){
//        for (int i = 0; i < nums.length; i++) { //2
//            for (int j = 0; j < nums.length ; j++) { //2,3,1,
//                if (i!=j){
//                    if (nums[i]+nums[j]==target){
//                        return new int[]{i, j};
//                    }
//                }
//            }
//        }
//        return new int[0];
//    }


    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(target-nums[i])) return new int[]{map.get(target-nums[i]), i};
            else{
                map.put(nums[i], i );
            }
        }
        return new int[0];
    }
}
