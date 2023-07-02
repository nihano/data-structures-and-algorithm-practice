package self_practice.generics.countTheNumbers;

import java.util.Arrays;
import java.util.List;

public class CountTheNumbers {
    public static void main(String[] args) {
        List<Integer> ci = Arrays.asList(1, 2, 3, 4, 1);
        int count = countIf(ci, new OddPredicate());
        System.out.println("Number of odd integers =" + count);
    }

    private static <T> int countIf(List<T> list, UnaryPredicate<T> up) {
        int count = 0;
        for (T elem : list) {
            if (up.test(elem)) {
                count++;
            }
        }
        return count;
    }


}
