package self_practice.linked_list_review;

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

    void addFirst(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
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
        return p1.data;
    }

    void deleteKthItemFromLast(int k) {
        Node p1 = head;
        Node p2 = head;
        Node prev = head;
        for (int i = 0; i < k; i++) {
            p2 = p2.next;
        }

        while (p2 != null) {
            prev = p1;
            p1 = p1.next;
            p2 = p2.next;
        }
        if (p1 == head) {
            head = p1.next;
            p1.next = null;
            size--;
        } else if (p1 == tail) {
            tail = prev;
            prev.next = null;
            size--;
        } else {
            prev.next = p1.next;
            p1.next = null;
            size--;
        }
    }

    public void removeKthFromLast2(int k) {
        Node ptr1 = head;
        Node ptr2 = head;
        for (int i = 0; i < k - 1; i++) {

            ptr2 = ptr2.next;

            if (ptr2 == null) System.out.println("Less than k elements");

            else if (ptr2.next == null) {
                head = ptr1.next;
                ptr1.next = null;
                return;
            }
        }
        while (ptr2.next.next != null) {

            ptr1 = ptr1.next;
            ptr2 = ptr2.next;

        }
        ptr1.next = ptr1.next.next;
        ptr1 = ptr1.next;
        ptr1 = null;
    }


//    MySinglyLinkedList reverse(){
//        MySinglyLinkedList newList = new MySinglyLinkedList();
//        Node prev=head;
//        Node current=head;
//        while (current!=null){
//            if (current==tail){
//                newList.head=current;
//                tail=prev;
//                prev.next=null;
//            }
//            prev=current;
//            current=current.next;
//        }
//        return newList;
//    }


}
