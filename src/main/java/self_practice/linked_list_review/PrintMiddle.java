package self_practice.linked_list_review;

import self_practice.stack_Practice.MyStack;

import java.util.HashMap;
import java.util.Map;

public class PrintMiddle {
    public static void main(String[] args) {
        MySinglyLinkedList list = new MySinglyLinkedList();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        printMiddle(list);
    }
    public static void printMiddle(MySinglyLinkedList list) {
        Node slow = list.head;
        Node fast = list.head;

        while(fast!=list.tail && fast.next!=list.tail){
            slow=slow.next;
            fast=fast.next.next;
        }
        if (fast==list.tail) System.out.println(slow.data);
        else System.out.println(slow.data + ", " + slow.next.data);

    }
}



