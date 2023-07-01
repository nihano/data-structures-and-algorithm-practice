package linkedList.leetcode;

public class TestLinkedList {
    public static void main(String[] args) {
        MySinglyLinkedList linkedList = new MySinglyLinkedList();
        linkedList.addData(1);
        linkedList.addData(2);
        linkedList.addData(3);
        linkedList.addData(4);
        linkedList.addData(5);
        linkedList.addData(6);
        linkedList.addData(7);
        linkedList.printNodes();
        MySinglyLinkedList.reverse(linkedList);
        linkedList.printNodes();
        System.out.println(linkedList.head.value);
        System.out.println(linkedList.tail.value);
        System.out.println(linkedList.findKthFromLast(2));
        System.out.println(linkedList.getKthItemFromLast(2));
        linkedList.deleteKthItemFromLast(1);
        linkedList.printNodes();
        System.out.println(linkedList.tail.value);



    }
}
