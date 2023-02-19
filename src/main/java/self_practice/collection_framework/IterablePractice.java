package self_practice.collection_framework;

import java.util.*;

public class IterablePractice {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"
        ));
        //Remove all the name "Ahmed" ignore the case sensitivity

        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String each = it.next();
            if (each.equalsIgnoreCase("ahmed")) {
                it.remove();
            }
        }
        System.out.println(names);

        //***************************removeIf()*****************************************//

        List<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"
        ));
        names2.removeIf(p -> p.equalsIgnoreCase("ahmed"));
        System.out.println(names2);

        //************************find the nth largest number*******************************
        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9));

        int n = 5;

        for (int i = 0; i<n-1; i++){
            numbers.removeIf(p -> Collections.max(numbers) == p);
        }

        int max = Collections.max(numbers);
        System.out.println(max);


        //************************Trying constructor*************************************
        List<Integer> numbers2 = new ArrayList<>();
        numbers2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9));

        TreeSet<Integer> set =  new TreeSet<Integer>(numbers2);
        ArrayList<Integer> list = new ArrayList<>(set);
        System.out.println(list); //duplicates removed
        System.out.println(list.get(list.size() - 5));// getting the 5th largest number


    }

}
