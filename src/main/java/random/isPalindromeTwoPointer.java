package random;

public class isPalindromeTwoPointer {
    public static void main(String[] args) {
        int n=23321;
        System.out.println(isPalindrome(n));
    }

    public static boolean isPalindrome(int n){
        String s=n+"";
        int left=0;
        int right=s.length()-1;
        while (left<right){
            if (s.toLowerCase().charAt(left)!=s.toLowerCase().charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
