package leet_code.medium._55_JumpGame;

public class _55_JumpGame {
    public static void main(String[] args) {
        int[] nums = {};

        //1,0,1,0
        //2,0,0
        //1,0,0
        //2,5,0,0
        //[1,1,2,2,0,1,1] !!!!!
        //            0 1 2
        //            i i
        //            j j
        System.out.println(jumpGame(nums));
        /*



        if 1< 2 2-0 move i times

         */

    }

    private static boolean jumpGame(int[] nums) {
        int lastIdx = nums.length - 1;
        int i = 0;
        int count = nums[i];
        while (i < nums.length) {
            if (nums[i]>=lastIdx-i) return true;
            if (nums[i] < lastIdx - i) {
                if (nums[i]==0) return false;
                while (count > 0) {
                    if (nums[i]>=lastIdx - i){
                        return true;
                    }else{
                        i++;
                        count--;
                    }
                }
            }
            count = nums[i];
        }
        return false;
    }
}
