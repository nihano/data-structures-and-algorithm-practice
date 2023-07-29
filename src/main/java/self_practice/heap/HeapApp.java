package self_practice.heap;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HeapApp {
    public static void main(String[] args) {
        MyHeap heap=new MyHeap(10);
        heap.insert(61);
        heap.insert(120);
        heap.insert(52);
        heap.insert(45);
        heap.insert(81);
        heap.printHeap();

//        System.out.println(heap.size);
//        System.out.println(heap.length());
//        System.out.println(heap);
//        System.out.println(Arrays.toString(heap.items));

        heap.remove();
        heap.printHeap();
        heap.insert(130);
        heap.printHeap();
        heap.remove();
        heap.printHeap();
    }
}
