package random;

public class StockPrices2 {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 7};
        System.out.println(question(arr, 2));
    }

    public static int question(int arr[], int k) {
        int count = 0;
        int n = arr.length;//5


        for (int i = 0; i < n - k + 1; i++) {

            int a = 0;
            for (int j = i; j < i + k - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    a++;
                } else {
                    break;
                }


            }
            if (a == k - 1) {
                count++;
            }
        }
        return count;
    }
}
