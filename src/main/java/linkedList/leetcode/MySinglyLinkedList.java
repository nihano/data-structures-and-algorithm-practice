package linkedList.leetcode;

import java.util.NoSuchElementException;

public class MySinglyLinkedList {
    Node head;
    Node tail;
    int size;

    public boolean isEmpty() {
        return head == null;
    }

    void addData(int data) {
        Node node = new Node(data);
        if (isEmpty()) head = tail = node;
        tail.next = node;
        tail = node;
        size++;
    }

    void printNodes() {
        Node current = head;
        while (current != null) {
            if (current.next == null) {
                System.out.println(current.value + "=>null ");
            } else {
                System.out.print(current.value + "=> ");
            }
            current = current.next;
        }
    }

    void deleteById(int data) {
        Node current = head;
        Node prev = head;
        if (isEmpty()) System.out.println("List is empty");
        while (current != null) {
            if (current.value == data) {
                if (current == head) {
                    head = current.next;
                    current.next = null;
                } else if (current == tail) {
                    tail = prev;
                    prev.next = null;
                } else {
                    prev.next = current.next;
                    current.next = null;
                }
            }
            prev = current;
            current = current.next;
        }
    }

    static void reverse(MySinglyLinkedList list) {
        Node prev = null;
        Node current = list.head;

        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        list.tail = list.head;
        list.head = prev;
    }

    int findKthFromLast(int k) {
        //0 1 2 3 4 5 6 7
        /*
        k=2
        slow fast
        0     2
        1     3
        2     4
        3     5
        4     6
        5     7
        6     null

        move fast k times
        move both one time
        when fast hit null slow will be on the kth element from last
        while fast!=null
         */

        Node slow = head;
        Node fast = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow.value;
    }

    int getKthItemFromLast(int k) {
        Node p1 = head;
        Node p2 = head;
        for (int i = 0; i < k; i++) {
            p2 = p2.next;
        }

        while (p2 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1.value;
    }

    void deleteKthItemFromLast(int k) {
        if (isEmpty()) System.out.println("List is empty");
        Node slow = head;
        Node fast = head;
        Node prev = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }

        if (slow == head) {
            head=slow.next;
            slow.next=null;
            size--;
        } else if (slow == tail) {
            tail = prev;
            prev.next = null;
            size--;
        } else {
            prev.next = slow.next;
            slow.next = null;
            size--;
        }
    }

}
