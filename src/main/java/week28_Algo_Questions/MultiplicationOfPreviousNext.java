package week28_Algo_Questions;

import java.util.Arrays;

public class MultiplicationOfPreviousNext {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 5, 10};
        System.out.println(Arrays.toString(multiplicationPrevNext(arr)));

    }
    public static int[] multiplicationPrevNext(int[] arr) {
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i != 0 && i != arr.length - 1) {
                arr2[i] = arr[i - 1] * arr[i + 1];
                arr2[0] = arr[0] * arr[1];
                arr2[arr.length - 1] = arr[arr.length - 1] * arr[arr.length - 2];
            }
        }
        return arr2;
    }
}
