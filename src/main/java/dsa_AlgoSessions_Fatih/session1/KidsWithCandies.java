package dsa_AlgoSessions_Fatih.session1;

import java.util.Arrays;

public class KidsWithCandies {
    public static void main(String[] args) {

        int[] candies = {2,3,5,1,2};
        int extraCandies=3;

        String[] strs = new String[]{"flower","flow","flight"};
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));

        System.out.println(Arrays.toString(kidsWithCandies(candies, extraCandies)));

    }

    public static boolean[] kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        for (int candy : candies) {
            if (candy>max){
                max=candy;
            }
        }

        boolean[] output = new boolean[candies.length];

        for (int i = 0; i < candies.length; i++) {
            output[i] = extraCandies+candies[i]>=max;

        }
        return output;

    }
}
