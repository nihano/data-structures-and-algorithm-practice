package self_practice.collection_framework;

public class StringUtility {

    public static String reverse(String str) {
        String reverse = ""; //to contain all the characters of the given string in reversed order

        for (int i = str.length() - 1; i >= 0; i--) { //i: index number of the given string starting from last index
            reverse += str.charAt(i); // to get each character of the string starting from last index to index zero
        }

        return reverse;

    }
}
