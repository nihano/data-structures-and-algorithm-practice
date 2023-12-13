package random.twoPointers;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr=new int[]{0,0,1,1,1,2,2};

        System.out.println(removeDuplicates(arr));

    }

    public static int removeDuplicates(int[] arr){
        int slow=0;
        for (int fast=0; fast<arr.length; fast++){
           if (arr[slow]!=arr[fast]){
               arr[++slow]=arr[fast];
           }
        }
        return slow+1;

    }
    /*
    Given a sorted list of numbers, remove duplicates and return the new length.
    You must do this in-place and without using extra memory.
    Input: [0, 0, 1, 1, 1, 2, 2].
    Output: 3.
     */
}
