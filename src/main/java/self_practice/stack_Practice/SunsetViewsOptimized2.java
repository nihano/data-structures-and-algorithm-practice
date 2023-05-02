package self_practice.stack_Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class SunsetViewsOptimized2 {

    public static void main(String[] args) {


        int[] buildings = new int[]{10, 5, 5, 11, 1};
        String direction = "west";
        sunsetViews(buildings, direction).forEach(System.out::println);
    }

    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction) {
        int i = 0;
        int step = 1;
        if (direction.equalsIgnoreCase("west")) {
            i = buildings.length - 1;
            step = -1;
        }
        Stack<Integer> stack = new Stack<>();
        while (i >= 0 && i < buildings.length) {
            while (!stack.isEmpty() && buildings[i] >= buildings[stack.peek()]) {
                stack.pop();
            }
            stack.push(i);
            i += step;
        }
        if (direction.equalsIgnoreCase("west")) Collections.reverse(stack);
        return new ArrayList<Integer>(stack);
    }
}
