package leet_code.easy._349_IntersectionOfTwoArrays;

import java.util.*;

public class _350_IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = new int[]{4, 4, 8, 9, 9};
        int[] nums2 = new int[]{4, 5, 9};

        System.out.println(Arrays.toString(intersectionSorted(nums1, nums2)));
        System.out.println(Arrays.toString(intersectionSortedByLength(nums1, nums2)));
        System.out.println(Arrays.toString(intersectionSortedOptimized(nums1, nums2)));

    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println(map);

        List<Integer> result = new ArrayList<>();
        for (int num : nums2) {
            if (map.containsKey(num)) {
                if (map.get(num) > 0) {
                    map.put(num, map.get(num) - 1);
                    result.add(num);
                }
            }
        }

        System.out.println(map);
        int[] intArray = result.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return intArray;
    }

    /*
    Follow up:

    What if the given array is already sorted? How would you optimize your algorithm?
    What if nums1's size is small compared to nums2's size? Which algorithm is better?
    What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
    */
    public static int[] intersectionSortedByLength(int[] nums1, int[] nums2) {
        if (nums1.length < nums2.length) {
            return intersectionSorted(nums1, nums2);
        }
        return intersectionSorted(nums2, nums1);
    }

    public static int[] intersectionSorted(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> result = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (j < nums2.length && i < nums1.length) {
            if (nums2[j] == nums1[i]) {
                result.add(nums2[j]);
                i++;
                j++;
            } else if (nums2[j] < nums1[i]) {
                j++;
            } else {
                i++;
            }
        }
        return result.stream()
                .mapToInt(num -> num)
                .toArray();

    }


    public static int[] intersectionSortedOptimized(int[] nums1, int[] nums2) {
        //assume that nums1.length<nums2.length
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0, k = 0;
        while (j < nums2.length && i < nums1.length) {
            if (nums2[j] == nums1[i]) {
                nums1[k++] = nums1[i++];
                j++;
            } else if (nums2[j] < nums1[i]) {
                j++;
            } else {
                i++;
            }
        }
        return Arrays.copyOfRange(nums1, 0, k);

    }

}
