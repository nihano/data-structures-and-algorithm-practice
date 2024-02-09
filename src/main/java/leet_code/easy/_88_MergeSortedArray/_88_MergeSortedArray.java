package leet_code.easy._88_MergeSortedArray;

import java.util.Arrays;

public class _88_MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1={3,6,7,0,0,0};
        int[] nums2={1,4,8};
        int m=3;
        int n=3;

        merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1=m-1;
        int p2=n-1;
        int last=nums1.length-1;

        while(last>=0){
            if(p1>=0 && p2>=0){
                if(nums1[p1]>=nums2[p2]){
                    nums1[last]=nums1[p1];
                    last--;
                    p1--;
                }else if(nums1[p1]<nums2[p2]){
                    nums1[last]=nums2[p2];
                    last--;
                    p2--;
                }
            }else if(p2>=0){
                nums1[last] = nums2[p2];
                last--;
                p2--;
            }else{
                break;
            }

        }

    }
}
