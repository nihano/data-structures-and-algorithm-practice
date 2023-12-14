package leet_code;

import java.util.HashSet;

public class _202_HappyNumber {

    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }
    public static boolean isHappy(int n) {
        HashSet<Integer> visit = new HashSet<>();
        while (!visit.contains(n)) {
            visit.add(n);
            n = sumOfSquares(n);
            if (n == 1) {
                return true;
            }
        }
        return false;
    }

    public static int sumOfSquares(int n) {
        int output = 0;
        while (n != 0) {
            int digit = n % 10;
            digit = digit * digit;
            output += digit;
            n = n / 10;
        }
        return output;
    }

}

