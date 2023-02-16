package self_practice.linked_list;

public class LinkedListApp {
    public static void main(String[] args) {

        MySinglyLinkedList list = new MySinglyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.print();

        System.out.println();
        System.out.println(list.indexOf(1));
        list.addFirst(5);
        list.print();

//        list.someMethod();

        System.out.println();
        System.out.println(list.returnKthFromLast(5));
        list.removeKthItem(5);
        list.print();
        System.out.println();
        System.out.println(list.returnKthFromLast(2));
        list.removeKthItem(2);
        list.print();


    }
}
