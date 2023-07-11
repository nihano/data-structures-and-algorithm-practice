package self_practice.linkedList.practice;

public class MyLinkedList {
    Node head;
    Node tail;
    int size;
    private Node curr;

    boolean isEmpty(){
        return head==null;
    }

    void printNode(){
        Node curr=head;
        while (curr!=null){
            System.out.print(curr.value+"=> ");
            curr=curr.next;
        }
        System.out.println("null");
    }

    void add(int value){
        Node node = new Node(value);
        if (isEmpty()){
            head=tail=node;
            size++;
        }
        tail.next=node;
        tail=node;
        size++;
    }



    //1=>2=>3=>null



}
