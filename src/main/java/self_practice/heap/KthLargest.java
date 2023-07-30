package self_practice.heap;

import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargest {
    public static void main(String[] args) {
        int[] numbers = {3, 2, 1, 5, 6, 4};
        System.out.println(getKthLargest(numbers, 2));
        System.out.println(getKthLargest2(numbers, 2));
    }

    public static int getKthLargest(int[] array, int k) {
        // create a heap
        MyHeap heap = new MyHeap(array.length);
        for (int i = 0; i < array.length; i++) {
            heap.insert(array[i]);
        }
        for (int i = 0; i < k - 1; i++) {
            heap.remove();
        }
        return heap.peek();
    }

    public static int getKthLargest2(int[] array, int k) {

        Queue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < array.length; i++) {
            queue.add(array[i]);

            if (queue.size()>k){
                queue.poll();
            }
        }

        return queue.peek();
    }
}
