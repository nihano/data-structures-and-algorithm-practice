package leet_code;

class _1343_NumberOfSubarraysSizeKThreshold {
    public int numOfSubarrays(int[] arr, int k, int threshold) {

        int currentSum=0;
        int count=0;

        for (int i=0; i<arr.length; i++){
            currentSum+=arr[i];

            if(i>=k-1){
                if((currentSum/k)>=threshold){
                    count++;
                }
                 currentSum-=arr[i-(k-1)];
            }
        }

        return count;
        
    }
}