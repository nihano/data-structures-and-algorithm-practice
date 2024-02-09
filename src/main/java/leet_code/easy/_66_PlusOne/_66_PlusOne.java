package leet_code.easy._66_PlusOne;

import java.util.Arrays;

class _66_PlusOne {
    public static int[] plusOne(int[] digits) {
        int j = digits.length;
        for(int i=j-1; i>=0; i--){
            if(digits[i]<9){
                digits[i]+=1;
                return digits;
            }else{
                digits[i]=0;
            }
        }

        int[] arr = new int[j+1];
        arr[0]=1;
        return arr;

    }

    public static void main(String[] args) {
        int[] digits = {1,2,3};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
}