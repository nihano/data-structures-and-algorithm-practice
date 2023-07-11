package self_practice.linkedList;

public class PrintMiddleNodes {
    public static void main(String[] args) {
        MySinglyLinkedList sll = new MySinglyLinkedList();
        for (int i = 1; i < 7; i++) {
            sll.addData(i);
        }
        printMiddleNodes(sll);
    }

    static void printMiddleNodes(MySinglyLinkedList sll) {
        Node slow = sll.head;
        Node fast = sll.head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast.next == null) {
            System.out.println(slow.value);
        } else {
            System.out.println(slow.value + ", " + slow.next.value);
        }
    }
}
