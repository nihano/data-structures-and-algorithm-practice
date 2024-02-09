package leet_code.easy._349_IntersectionOfTwoArrays;

import java.util.*;

public class _349_IntersectionOfTwoArrays {

    public static void main(String[] args) {
        int[] nums1 = new int[]{4,7,9,7,6,7};
        int[] nums2 = new int[]{5,0,0,6,1,6,2,2,4};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));

    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set =  new HashSet<>();
        for (int i : nums1) set.add(i);

        Set<Integer> result = new HashSet<>();
        for (int i : nums2) {
            if (set.contains(i)){
               result.add(i);
            }
        }
        int[] arr = new int[result.size()];
        int i=0;
        for (Integer integer : result) {
            arr[i++]=integer;
        }
        return arr;
    }
}