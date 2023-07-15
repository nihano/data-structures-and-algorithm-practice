package random;

public class ReverseAStringRecursively {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverse(s));
    }

    public static String reverse(String s) {
        if (s.equals("")){
            return "";
        }
        return reverse(s.substring(1))+s.charAt(0);


        /*
        "" + o    => o
        "o" + l   => ol
        "lo" + l  => oll
        "llo" + e => olle
        "ello" + h=> olleh
         */
    }
}
