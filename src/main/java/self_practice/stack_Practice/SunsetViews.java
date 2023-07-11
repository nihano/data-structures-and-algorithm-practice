package self_practice.stack_Practice;

import java.util.ArrayList;
import java.util.List;

public class SunsetViews {
    public static void main(String[] args) {


        int[] buildingHeights = new int[]{10, 5, 4, 5, 1};
        System.out.println(sunsetViews(buildingHeights));
    }

    public static List<Integer> sunsetViews(int[] buildingHeights) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < buildingHeights.length; i++) {
            int max=0;
            for (int j = i+1; j < buildingHeights.length; j++) {
                if (buildingHeights[j]>max) max=buildingHeights[j];
            }
            if (buildingHeights[i]>max){
                list.add(i);
            }
        }
        return  list;
    }
}
