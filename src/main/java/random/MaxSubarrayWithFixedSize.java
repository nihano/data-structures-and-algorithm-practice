package random;

public class MaxSubarrayWithFixedSize {

    public static int maxSubarray(int[] arr, int k){
        int max = Integer.MIN_VALUE;
        int currentSum=0;

        for (int i=0; i<arr.length; i++){
            currentSum+=arr[i];
            if (i>=k-1){
                max= Math.max(currentSum, max);
                currentSum-=arr[i-(k-1)];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{4,2,1,7,8,1,2,8,1,0};
        int k=3;
        System.out.println(maxSubarray(arr, k));
    }
}
