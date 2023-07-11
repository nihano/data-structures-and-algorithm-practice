package self_practice.linkedList.practice;

public class ReverseLinkedList {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        for (int i = 1; i < 8; i++) {
            list.add(i);
        }
        list.printNode();
        reverse(list).printNode();
    }

    static MyLinkedList reverse(MyLinkedList list){
        //1---->2---->3---->4---->null
        //head              tail
        //prev  curr
        //1<----2<----3    4---->null
        //prev  curr  next
        //      prev  curr next
        //            prev curr
        //                      next
        //1<----2<----3<----4    null
        //head              tail
        //                  prev curr
        //4---->3---->2---->1---->null

        Node prev=list.head;
        Node curr=list.head.next;
        while (curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        list.tail=list.head;
        list.tail.next=null;
        list.head=prev;

        return list;
    }


}
