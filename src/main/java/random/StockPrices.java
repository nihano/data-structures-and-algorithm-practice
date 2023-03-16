package random;

public class StockPrices {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3,4,5,6};

        System.out.println(question(arr, 6));
    }

    public static int question(int arr[], int k) {
        int count = 0;
        int check=0;
        for (int i = 0; i < (arr.length) - k + 1; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i; j < i + k; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    check=j;
                } else {
                    break;
                }
            }
            if(check==i+k-1){
                count++;
            }
        }
        return count;
    }
}

/*
Given an array that represents the stock prices of consecutive months and analysis factor k
find how many periods where stocks prices are strictly increasing , the period should be of k length
Ex:
arr= [ 5,3,5,6,8] ,  k=3
answer :
2
arr=[1,2,3,4] , k=4
answer
1
 */
