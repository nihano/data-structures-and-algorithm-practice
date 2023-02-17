package self_practice.linked_list;

public class MySinglyLinkedList {

    Node head;
    Node tail;
    int size;

    void add(int id) {
        Node node = new Node(id);
        if (head == null) {
            head = node;
            tail = node;
            size++;
        } else {
            tail.next = node;
            tail = node;
            size++;
        }
    }

    void print() {
        Node current = head;
        while (current != null) {
            if (current == tail) {
                System.out.print(current.id + "=>null");
            } else {
                System.out.print(current.id + "=>");
            }
            current = current.next;
        }
    }

    void someMethod() {
        Node prev = head;
        Node current = head;
        prev.next = current.next;
        current.next = null;
        System.out.println();
        System.out.println("prev: " + prev.id);
        System.out.println("head : " + head.id);
        System.out.println("current: " + current.id);
    }

    int indexOf(int id) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.id == id)
                return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    void addFirst(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = tail=node;
        } else {
            node.next = head;
            head = node;
        }

        size++;
    }

    int returnKthFromLast(int k) {
        int a = 0;
        Node p1 = head;
        Node p2 = head;
        while (a < k) {
            p2 = p2.next;
            a++;
        }
        while (p2 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1.id;
    }

    void removeKthItem(int k) {
        Node current = head;
        Node prev = head;
        if (head == null) System.out.println("List is empty");
        int id = returnKthFromLast(k);

        while (current != null) {
            if (current.id == id) {
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
                size--;
            }

            prev = current;
            current = current.next;

        }

    }


}

