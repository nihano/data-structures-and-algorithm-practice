package leet_code;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = new String[]{"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) return "";
        String shortest = strs[0];
        for (String each : strs) {
            if (each.length() < shortest.length()) shortest = each;
        }

        String res = shortest;
        String newRes = "";
        for (String each : strs) {
            for (int i = 0; i < shortest.length(); i++) {
                if (each.charAt(i) == shortest.charAt(i)) {
                    newRes += shortest.charAt(i);
                } else {
                    break;
                }
            }

            if (newRes.length() <= res.length()) {
                res = newRes;
                newRes="";
            }

        }

        return res;
    }
}


