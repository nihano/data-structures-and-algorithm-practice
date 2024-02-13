package random;

public class SawtoothCheckAgainBoilerplate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 1};
        System.out.println(isDecreasing(arr));
        System.out.println(isIncreasing(arr));
        System.out.println(countSawtooth(arr));
    }

    public static int countSawtooth(int[] arr) {
        if (isSawtooth(arr)) {
            int count = 0;
            for (int i = 1; i < arr.length; i++) {
                count += i;
            }
            return count;
        }
        if (isIncreasing(arr) || isDecreasing(arr)) {
            return arr.length - 1;
        }
        return 0;

    }

    public static boolean isSawtooth(int[] arr) {
        if (arr.length >= 2) {
            if (arr[0] < arr[1]) {
                for (int i = 0, j = 1; i < arr.length - 1; i += 2, j += 2) {
                    if (!(arr[i] < arr[i + 1])) {
                        return false;
                    }

                    if (!(arr[j] > arr[j + 1])) {
                        return false;
                    }
                }

            } else if (arr[0] > arr[1]) {
                for (int i = 0, j = 1; i < arr.length - 1; i += 2, j += 2) {
                    if (!(arr[i] > arr[i + 1])) {
                        return false;
                    }

                    if (!(arr[j] < arr[j + 1])) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean isIncreasing(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (!(arr[i] > arr[i + 1])) return false;
        }
        return true;
    }

    public static boolean isDecreasing(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (!(arr[i] < arr[i + 1])) return false;
        }
        return true;
    }
}

/*7

Given an array of integers arr, your task is to count the number of contiguous subarrays that represent a sawtooth sequence of at least two elements.

For arr = [9, 8, 7, 6, 5], the output should be countSawSubarrays(arr) = 4. Since all the elements are arranged in decreasing order, it won’t be possible to form any sawtooth subarray of length 3 or more. There are 4 possible subarrays containing two elements, so the answer is 4.

For arr = [10, 10, 10], the output should be countSawSubarrays(arr) = 0. Since all of the elements are equal, none of subarrays can be sawtooth, so the answer is 0.

For arr = [1, 2, 1, 2, 1], the output should be countSawSubarrays(arr) = 10.

All contiguous subarrays containing at least two elements satisfy the condition of the problem. There are 10 possible contiguous subarrays containing at least two elements, so the answer is 10.

 */
