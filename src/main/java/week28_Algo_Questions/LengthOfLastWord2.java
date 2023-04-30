package week28_Algo_Questions;

public class LengthOfLastWord2 {
    public static void main(String[] args) {

        String s = "My name is Nihan";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i) + "";
        }

        String lastReversed = result.substring(0, result.indexOf(' '));

        /*
        not necessary for size
        String lastWord = "";
        for (int i = lastReversed.length() - 1; i >= 0; i--) {
            lastWord += lastReversed.charAt(i) + "";
        }
         */
        return lastReversed.length();
    }

}
