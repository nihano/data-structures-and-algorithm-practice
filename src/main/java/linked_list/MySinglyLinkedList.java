package linked_list;

public class MySinglyLinkedList {

    Node head;
    Node tail;
    int size;

    boolean isEmpty() {
        return head == null;
    }

    void add(int data) {
        Node node = new Node(data);
        if (isEmpty()) head = tail = node;
        tail.next = node;
        tail = node;
        size++;
    }

    void printLinkedList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "=>");
            if (current.next == null) System.out.println("null");
            current = current.next;
        }
    }

    void deleteById(int data) {
        Node current = head;
        Node prev = head;
        if (isEmpty()) System.out.println("List is empty");
        while (current != null) {
            if (current.data == data) {
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

    int indexOf(int data) {
        Node current = head;
        int position = 0;
        if (isEmpty()) return -1;
        while (current != null) {
            if (current.data == data) {
                return position;
            }
            position++;
            current = current.next;
        }

        return -1;

    }


}
