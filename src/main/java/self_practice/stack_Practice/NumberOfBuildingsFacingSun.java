package self_practice.stack_Practice;

public class NumberOfBuildingsFacingSun {
    public static void main(String[] args) {


        int[] buildingHeights = new int[]{10,3, 5, 4, 4, 3, 1, 3, 2,9, 2};
        System.out.println(sunsetViews(buildingHeights));
    }

    public static int sunsetViews(int[] buildingHeights) {

        int count = 1;
        int max = buildingHeights[buildingHeights.length - 1];
        for (int i = buildingHeights.length - 2; i >= 0; i--) {
            if (buildingHeights[i] > max) {
                max = buildingHeights[i];
                count++;
            }
        }
        return count;
    }
}

