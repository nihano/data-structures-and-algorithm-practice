package random;

public class SawtoothCheckAgainBoilerplate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 1};
        System.out.println(isDecreasing(arr));
        System.out.println(isIncreasing(arr));
        System.out.println(countSawtooth(arr));
    }

    public static int countSawtooth(int[] arr) {
        if (isSawtooth(arr)) {
            int count = 0;
            for (int i = 1; i < arr.length; i++) {
                count += i;
            }
            return count;
        }
        if (isIncreasing(arr) || isDecreasing(arr)) {
            return arr.length - 1;
        }
        return 0;

    }

    public static boolean isSawtooth(int[] arr) {
        if (arr.length >= 2) {
            if (arr[0] < arr[1]) {
                for (int i = 0, j = 1; i < arr.length - 1; i += 2, j += 2) {
                    if (!(arr[i] < arr[i + 1])) {
                        return false;
                    }

                    if (!(arr[j] > arr[j + 1])) {
                        return false;
                    }
                }

            } else if (arr[0] > arr[1]) {
                for (int i = 0, j = 1; i < arr.length - 1; i += 2, j += 2) {
                    if (!(arr[i] > arr[i + 1])) {
                        return false;
                    }

                    if (!(arr[j] < arr[j + 1])) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean isIncreasing(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (!(arr[i] > arr[i + 1])) return false;
        }
        return true;
    }

    public static boolean isDecreasing(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (!(arr[i] < arr[i + 1])) return false;
        }
        return true;
    }
}
