package lambdaExp;

import java.util.function.Predicate;

public class LambdaPractice {

    public static void main(String[] args) {

        Predicate<Integer> isOdd = p -> p % 2 != 0;
        System.out.println(isOdd.test(12));

        Predicate<Integer> isPalindrome = p -> {
            String s = p.toString();
            for (int i = 0; i < s.length() / 2; i++) {
                String beg = s.charAt(i) + "";
                String end = s.charAt(s.length() - 1 - i) + "";
                if (beg.equalsIgnoreCase(end)) {
                    return true;

                }
            }
            return false;
        };

        System.out.println(isPalindrome.test(567765));

    }
}
