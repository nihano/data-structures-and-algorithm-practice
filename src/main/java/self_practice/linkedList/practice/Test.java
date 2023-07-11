package self_practice.linkedList.practice;

public class Test {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        for (int i = 1; i < 5 ; i++) {
            list.add(i);
        }
        list.printNode();
    }


}
