package leet_code;

import java.util.Arrays;

public class _283_MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0,1,0,2,0,0,7};
        System.out.println(Arrays.toString(move(nums)));
    }

    static int[] move(int[] nums){
        int j=0;
        int i=0;
        while(j<nums.length){
            if(nums[j]!=0){
                nums[i]=nums[j];
                nums[j]=0;
                i++; //1
            }
            j++;
        }

        while(i<nums.length){
            nums[i]=0;
            i++;
        }
        return nums;

    }
}
