package leet_code.medium._1343_NumberOfSubarraysSizeKThreshold;

public class _1343_NumberOfSubarraysSizeKThreshold {
    public static int numOfSubarrays(int[] arr, int k, int threshold) {

        int currentSum = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (i >= k - 1) {
                if ((currentSum / k) >= threshold) {
                    count++;
                }
                currentSum -= arr[i - (k - 1)];
            }
        }

        return count;

    }

    public static void main(String[] args) {
        System.out.println(numOfSubarrays(new int[]{2, 2, 2, 2, 5, 5, 5, 8}, 3, 4));
    }

}
