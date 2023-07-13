package self_practice.queue;

import java.util.Stack;

public class ReverseTheOrderOfFirstKElements {
    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<>();
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(5);
        myQueue.printQueue();
        reverseTheOrder(myQueue, 3).printQueue();
    }

    static MyQueue<Integer> reverseTheOrder(MyQueue<Integer> myQueue, int k){
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++) {
            stack.push(myQueue.dequeue());
        }
        while (!stack.isEmpty()){
            myQueue.enqueue(stack.pop());
        }
        for (int i = 0; i < myQueue.size-k; i++) {
            Integer item = myQueue.dequeue();
            myQueue.enqueue(item);
        }
        return myQueue;
    }
}
