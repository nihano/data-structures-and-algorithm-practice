package self_practice.linked_list_review;

public class TestLinkedList {
    public static void main(String[] args) {
        MySinglyLinkedList mySinglyLinkedList = new MySinglyLinkedList();
        mySinglyLinkedList.add(1);
        mySinglyLinkedList.add(2);
        mySinglyLinkedList.add(3);

        mySinglyLinkedList.printLinkedList();

        mySinglyLinkedList.deleteById(3);
        mySinglyLinkedList.printLinkedList();

        mySinglyLinkedList.deleteById(1);
        mySinglyLinkedList.printLinkedList();

        mySinglyLinkedList.add(3);
        mySinglyLinkedList.add(4);
        mySinglyLinkedList.add(5);

        mySinglyLinkedList.deleteById(3);
        mySinglyLinkedList.printLinkedList();

        System.out.println(mySinglyLinkedList.indexOf(1));

        mySinglyLinkedList.addFirst(1);
        mySinglyLinkedList.printLinkedList();

        MySinglyLinkedList list = new MySinglyLinkedList();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.printLinkedList();
        System.out.println(list.getKthItemFromLast(4));

        list.deleteKthItemFromLast(2);
        list.printLinkedList();


    }


}
