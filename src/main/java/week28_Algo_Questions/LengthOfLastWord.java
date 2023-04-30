package week28_Algo_Questions;

public class LengthOfLastWord {

    public static void main(String[] args) {
        String s = "Hello World  ";
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result+=s.charAt(i)+"";
        }

        System.out.println(result + "***");


        String lastReverse = result.substring(0, result.indexOf(' '));

        String lastWord="";
        for (int i = lastReverse.length() - 1; i >= 0; i--) {
            lastWord+=lastReverse.charAt(i)+"";
        }
        System.out.println(lastWord);

    }

}
