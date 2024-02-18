package leet_code.medium._19_RemoveNthNodeFromEndOfList;

public class Solution {

    public static Node removeNthFromEnd(Node head, int n){
        Node dummy = new Node(0);
        dummy.next=head;
        Node left=dummy;
        Node right=head;

        while (n>0 && right!=null){
            right=right.next;
            n--;
        }

        while (right!=null){
            left=left.next;
            right=right.next;
        }

        left.next=left.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;

        removeNthFromEnd(node1, 3);
        Node current =node1;
        while (current!=null){
            if (current.next==null){
                System.out.println(current.id + "=>null");
                break;
            }
            System.out.print(current.id + "=>");
            current=current.next;
        }



    }
}
