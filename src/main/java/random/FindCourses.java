package random;

import java.util.*;

public class FindCourses {
    public static void main(String[] args) {
        List<List<String>> enrolments = new ArrayList<>();
        enrolments.add(new ArrayList<>(Arrays.asList("58", "Linear Algebra")));
        enrolments.add(new ArrayList<>(Arrays.asList("94", "Art History")));
        enrolments.add(new ArrayList<>(Arrays.asList("94", "Operating Systems")));
        enrolments.add(new ArrayList<>(Arrays.asList("17", "Software Design")));
        enrolments.add(new ArrayList<>(Arrays.asList("58", "Mechanics")));
        enrolments.add(new ArrayList<>(Arrays.asList("58", "Economics")));
        enrolments.add(new ArrayList<>(Arrays.asList("17", "Political Science")));
        enrolments.add(new ArrayList<>(Arrays.asList("94", "Economics")));
        enrolments.add(new ArrayList<>(Arrays.asList("58", "Software Design")));
        enrolments.add(new ArrayList<>(Arrays.asList("17", "Economics")));
        enrolments.add(new ArrayList<>(Arrays.asList("17", "Economics")));

        System.out.println(findCoursePairs(enrolments));


    }

    public static Map<String, List<String>> findCoursePairs(List<List<String>> enrollments) {
        Map<String, LinkedHashSet<String>> courseMap = new HashMap<>();
        for (int i = 0; i < enrollments.size(); i++) {
            String course = enrollments.get(i).get(1);
            String id = enrollments.get(i).get(0);
            LinkedHashSet<String> mapValue = courseMap.get(course);
            if (courseMap.containsKey(course)) {
                mapValue.add(id);
                courseMap.put(course, mapValue);
            } else {
                courseMap.put(course, new LinkedHashSet<>(Arrays.asList(id)));
            }
        }


        List<String> idPairs = new ArrayList<>();
        for (int i = 0; i < enrollments.size(); i++) {
            if (!idPairs.contains(enrollments.get(i).get(0))){
                idPairs.add(enrollments.get(i).get(0));
            }
        }

        Map<String, List<String>> coursesPairs = new HashMap<>();
        for (int i = 0; i < idPairs.size(); i++) {
            for (int j = i+1; j < idPairs.size(); j++) {
                coursesPairs.put((idPairs.get(i) + ", " + idPairs.get(j)), null);
            }
        }

        for (Map.Entry<String, LinkedHashSet<String>> eachEntry : courseMap.entrySet()) {
            if (eachEntry.getValue().size() >= 2) {

            }
        }

        return coursesPairs;
    }

}