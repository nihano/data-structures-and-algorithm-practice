package self_practice.generics;

import java.util.Arrays;

public class SwapValues {

    public static void main(String[] args) {
        Integer[] a = {1, 2, 3, 4};
        swap(a, 0, 2);
        System.out.println(Arrays.toString(a));
    }

    public static <T> void swap(T[] array, int idx1, int idx2) {
        T temp=array[idx1];
        array[idx1]=array[idx2];
        array[idx2]=temp;
    }


}
