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

    void deleteById(int data){
        Node current = head;
        Node prev=head;
        if (isEmpty()) System.out.println("List is empty");
        while (current!=null){
            if (current.value==data){
                if (current==head){
                    head=current.next;
                    current.next=null;
                } else if (current==tail) {
                   tail=prev;
                   prev.next=null;
                }else{
                    prev.next=current.next;
                    current.next=null;
                }
            }
            prev=current;
            current=current.next;
        }
    }

    static void reverse(MySinglyLinkedList list){
        Node prev = null;
        Node current=list.head;

        while (current!=null){
            Node next = current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        list.tail=list.head;
        list.head=prev;
    }


}
