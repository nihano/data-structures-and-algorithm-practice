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

        long numberOfOperations = 0;
        int n = 10000000; //size of data
        int m = 500;
        long startTime;
        long endTime;
        System.out.println("Input size n is = " + n);
        MySinglyLinkedList list = new MySinglyLinkedList();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
//        list.printLinkedList();
//        System.out.println(list.getKthItemFromLast(3));
//
//        list.deleteKthItemFromLast(1);
//        list.printLinkedList();

        MySinglyLinkedList list2 = new MySinglyLinkedList();
        for (int i = 0; i < n; i++) {
            list2.add(i);
        }

        System.out.println("----------------------");

        startTime = System.currentTimeMillis();
        list.deleteKthItemFromLast(2);
        endTime = System.currentTimeMillis();
        System.out.println("method 1: "+ (endTime-startTime) + " miliseconds");


        startTime = System.currentTimeMillis();
        list2.removeKthFromLast2(2);
        endTime = System.currentTimeMillis();
        System.out.println("method 2: "+ (endTime-startTime) + " miliseconds");


    }


}
