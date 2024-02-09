package self_practice.comparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(404);
        values.add(908);
        values.add(639);
        values.add(265);

//        Comparator<Integer> comparator = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                if (o1%10>o2%10){
//                    return 1;
//                }else{
//                    return -1;
//                }
//            }
//        };

//        Comparator<Integer> comparator = (o1, o2) -> o1 % 10 > o2 ? 1 : -1;
//        Collections.sort(values, comparator);

        Collections.sort(values, (o1, o2) -> o1 % 10 > o2 ? 1 : -1);

        values.forEach(value -> System.out.println(value));
    }

}

