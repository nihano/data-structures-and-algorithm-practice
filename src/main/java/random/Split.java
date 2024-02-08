package random;

import java.util.ArrayList;
import java.util.List;

public class Split {
    public static void main(String[] args) {
        String str = "youAreCool";
//         [“you”, “are” ,”cool” ]
        System.out.println(split(str));
    }

    public static List<String> split(String str){
        ArrayList<String> list = new ArrayList<>();
        int l = 0;
        int r = 0;
        int length = str.length();
        while (r <length) {
            char ch = str.charAt(r);
            if (ch >= 'A' && ch <='Z' ) {
                list.add(str.substring(l, r).toLowerCase());
                l = r;
            }
            r++;
        }
        list.add(str.substring(l).toLowerCase());

        return list;
    }
}
