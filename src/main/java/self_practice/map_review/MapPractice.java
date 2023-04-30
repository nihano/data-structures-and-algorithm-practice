package self_practice.map_review;

import java.util.*;

public class MapPractice {
    public static void main(String[] args) {
        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");

        int female=0;
        int male=0;
        for (String value : employeeMap.values()) {
            if (value.equalsIgnoreCase("f")){
                female++;
            } else if (value.equalsIgnoreCase("m")) {
                male++;
            }
        }
        System.out.println(female + " : " + male);

       for(Map.Entry<String , String> eachEntry : employeeMap.entrySet()){
           if (eachEntry.getValue().equals("M")){
               eachEntry.setValue("F");
           }else {
               eachEntry.setValue("M");
           }
       }
        System.out.println(employeeMap);

       int a=0120;
        System.out.println(a);

        List<Integer> list = new ArrayList<>();
        List<List<Integer>> arr = new ArrayList<>();

        List<Integer> list1= Arrays.asList(-9,-9,-9,1,1,1);
        List<Integer> list2= Arrays.asList(0,-9,0,4,3,2);
        List<Integer> list3= Arrays.asList(-9,-9,-9,1,2,3);
        List<Integer> list4= Arrays.asList(0,0,8,6,6,0);
        List<Integer> list5= Arrays.asList(0,0,0,-2,0,0);
        List<Integer> list6= Arrays.asList(0,0,1,2,4,0);
        arr.add(list1);
        arr.add(list2);
        arr.add(list3);
        arr.add(list4);
        arr.add(list5);
        arr.add(list6);


        for (int i=0; i<arr.size()-2; i++){
            for (int j=0; j<arr.get(i).size()-2; j++){
                list.add((arr.get(i).get(j)+arr.get(i).get(j+1)+arr.get(i).get(j+2)+arr.get(i+1).get(j+1)+arr.get(i+2).get(j)+arr.get(i+2).get(j+1)+arr.get(i+2).get(j+2)));
            }
        }

        System.out.println(Collections.max(list));


    }
}
