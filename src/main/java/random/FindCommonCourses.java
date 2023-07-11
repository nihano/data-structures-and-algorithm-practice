package random;

import java.util.*;

public class FindCommonCourses {

    public static void main(String[] args) {
        List<List<String>> enrollments = new ArrayList<>();
        enrollments.add(new ArrayList<>(Arrays.asList("1", "A")));
        enrollments.add(new ArrayList<>(Arrays.asList("2", "B")));
        enrollments.add(new ArrayList<>(Arrays.asList("2", "C")));
        enrollments.add(new ArrayList<>(Arrays.asList("3", "D")));
        enrollments.add(new ArrayList<>(Arrays.asList("1", "E")));
        enrollments.add(new ArrayList<>(Arrays.asList("1", "F")));
        enrollments.add(new ArrayList<>(Arrays.asList("3", "G")));
        enrollments.add(new ArrayList<>(Arrays.asList("2", "F")));
        enrollments.add(new ArrayList<>(Arrays.asList("1", "D")));
        enrollments.add(new ArrayList<>(Arrays.asList("3", "F")));

        Set<String> courseIds = new HashSet<>();
        for (int i = 0; i < enrollments.size(); i++) {
            courseIds.add(enrollments.get(i).get(0));
        }



    }



}
