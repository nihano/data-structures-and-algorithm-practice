package leet_code.easy._222_SummaryRanges;

import java.util.ArrayList;
import java.util.List;

class SolutionWithStringBuilder {
    public static List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if (nums.length == 0) return list;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            int start = nums[i];
            while (i + 1 < nums.length && nums[i] + 1 == nums[i + 1]) {
                i++;
            }
            if (start != nums[i]) {
                sb.append(start).append("->").append(nums[i]);
            } else {
                sb.append(start);
            }
            list.add(sb.toString());
            sb.setLength(0); // Clear StringBuilder for next iteration
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {0,4,5,6};
        System.out.println(summaryRanges(nums));
    }
}