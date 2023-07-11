package week22;

import java.util.Arrays;

public class MoveZerosToTheEnd {
    public static void main(String[] args) {
        int[] arr = {0,1, 0, 2, 0, 0, 7};
                //   i  j
        System.out.println(Arrays.toString(moveZeros(arr)));
    }

    static int[] moveZeros(int[] arr) {
        int i=0;
        int j=1;
        while (j<arr.length){
            if (arr[i]==0){
                if (arr[j] != 0) {
                    arr[i] = arr[j];
                    arr[j] = 0;
                    i++;
                }
            }else{
                i++;
            }
            j++;
        }
       return arr;
    }

//    static int[] moveZeros(int[] arr) {
//        int i=0;
//        int j=1;
//        int lastZero=0;
//        while(j<arr.length){
//            if (arr[i]!=0){
//                lastZero=i; //0
//                i++;//1
//                j++;//2
//            } else if (arr[i]==0 && arr[j]!=0) {
//                arr[lastZero+1]=arr[j]; //1 2 7 0 0 7
//                arr[j]=0;
//                lastZero++; //2
//                i++; //2, 6
//                j++; //3, 7
//            } else if (arr[i]==0 && arr[j]==0) {
//                i++;
//                j++;
//            }
//        }
//
//        while (lastZero<arr.length-1){
//            arr[lastZero+1]=0;
//            lastZero++;
//        }
//        return arr;
//    }

}
