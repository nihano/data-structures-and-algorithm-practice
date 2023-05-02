package self_practice.stack_Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SunsetViewsOptimized {
    public static void main(String[] args) {


        int[] buildings = new int[]{10, 5, 5, 11, 1};
        String direction = "west";
        System.out.println(sunsetViews(buildings, direction));
    }

    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction) {
        MyStack<Integer> stack = new MyStack();
        ArrayList<Integer> list = new ArrayList<>();
        if (direction.equals("east")) {
            for (int i = buildings.length - 1; i >= 0; i--) {
                if (stack.isEmpty()) {
                    stack.push(i);
                } else if (!stack.isEmpty() && buildings[stack.peek()] < buildings[i]) {
                    stack.push(i);
                } else if (!stack.isEmpty() && buildings[stack.peek()] > buildings[i]) {
                    continue;
                }
            }
        } else if (direction.equals("west")) {
            for (int i = 0; i < buildings.length; i++) {
                if (stack.isEmpty()) {
                    stack.push(i);
                } else if (!stack.isEmpty() && buildings[stack.peek()] < buildings[i]) {
                    stack.push(i);
                } else if (!stack.isEmpty() && buildings[stack.peek()] > buildings[i]) {
                    continue;
                }
            }
        }

        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        return list;
    }



}
