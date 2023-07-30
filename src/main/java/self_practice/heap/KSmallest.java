package self_practice.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class KSmallest {
    public static void main(String[] args) {
        int[] numbers = {3, 2, 1, 5, 6, 4};
        System.out.println(kthSmallest(numbers, 2));
    }

    public static int kthSmallest(int[] array, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < array.length; i++) {
            pq.add(array[i]);
            if (pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }
}
