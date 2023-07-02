package linkedList.leetcode;

public class ReverseLinkedList {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        System.out.println(node1.hashCode());
        System.out.println(node2.hashCode());
        System.out.println(node3.hashCode());
        System.out.println(node4.hashCode());

        node1.next=node2;;
        node2.next=node3;;
        node3.next=node4;;
        node4.next=null;;

        System.out.println(reverseLinkedList(node1).hashCode());
    }

    public static Node reverseLinkedList(Node head){
        Node prev=head;
        Node curr=head.next;
        while (curr!=null){
            Node nextNode = curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        return prev;
    }
}
