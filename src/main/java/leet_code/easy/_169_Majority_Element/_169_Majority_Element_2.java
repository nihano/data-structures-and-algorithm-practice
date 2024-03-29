package leet_code.easy._169_Majority_Element;

import java.util.HashMap;
import java.util.Map;

public class _169_Majority_Element_2 {
    public static void main(String[] args) {

        int[] nums = {-1, 1, 1, 1, 2, 1};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map =new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue()>nums.length/2){
                return entry.getKey();
            }
        }
        return 0;
    }

}

