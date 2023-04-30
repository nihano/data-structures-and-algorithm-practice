package week28_Algo_Questions;

import java.util.ArrayList;
import java.util.List;

public class LengthOfLast {

    public static void main(String[] args) {

        String s =" Hello World  ";

        System.out.println(lengthOfLast(s));
    }

    public static int lengthOfLast(String s){
        List<Character> list = new ArrayList<>();
        for (int i=s.length()-1; i>=0; i--){
            list.add(s.charAt(i));
        }

        for (Character character : list) {
            if (list.get(1)==' '){
                list.remove(1);
            }
        }

        System.out.println(list);
        return list.size();
    }
}
