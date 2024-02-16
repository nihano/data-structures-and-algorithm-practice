package leet_code.easy._222_SummaryRanges;

import java.util.ArrayList;
import java.util.List;

class _228_SummaryRanges {
    public static List<String> summaryRanges(int[] nums) {
        ArrayList<String> list=new ArrayList<>();
//        {0,};
        for(int i=0;i<nums.length;i++){
            int start=nums[i]; //0
            while(i+1<nums.length && nums[i]+1==nums[i+1]){
                i++;//1,2,
            }
            if(start!=nums[i]){
                list.add(""+start+"->"+nums[i]);
            }
            else{
                list.add(""+start);
            }
        }
        return list;

    }

    public static void main(String[] args) {
        int[] nums = {0,4,5,6};
        System.out.println(summaryRanges(nums));

    }
}