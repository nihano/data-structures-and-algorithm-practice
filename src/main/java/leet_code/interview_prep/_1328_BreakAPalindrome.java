package leet_code.interview_prep;

public class _1328_BreakAPalindrome {

    public static String breakPalindrome(String palindrome) {
        int length = palindrome.length();
        //aaa.  abcd
        if (length == 1) return "";
        char[] chPalindrome = palindrome.toCharArray();
        for (int i = 0; i < length / 2; i++) {
            if (chPalindrome[i] != 'a') {
                chPalindrome[i] = 'a';
                return String.valueOf(chPalindrome);
            }
        }

        chPalindrome[length - 1] = 'b';
        return String.valueOf(chPalindrome);

    }

    public static void main(String[] args) {
        String palindrome = "racecar";
        System.out.println(breakPalindrome(palindrome));
    }
}



