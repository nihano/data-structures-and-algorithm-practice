package self_practice.linked_list;

public class LinkedListDemo {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.next=node2;
        System.out.println(node1);
        System.out.println(node1.next);
        System.out.println(node2);
        node2.next=node3;
        node3.next=node4;

        Node head = node1;
        Node current = head;

        while (current!=null){
            System.out.println(current.id);
            current=current.next;
        }

    }
}
