package linkedList.leetcode;

import java.util.HashSet;

public class FindCycle {
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
       node5.next=null;

//        System.out.println(findCycle(node1));
        System.out.println(hasCycle2(node1));
    }


    static boolean findCycle(Node node){
        HashSet<Node> set = new HashSet<>();
        Node current=node;
        while (current!=null){
            if (!set.add(current)) return true;
            current=current.next;
        }
        return false;
    }

    static boolean hasCycle(Node head){
        HashSet<Node> visited = new HashSet<>();
        Node current=head;
        while (current!=null){
            if (visited.contains(current)) return true;
            visited.add(current);
            current=current.next;
        }
        return false;
    }

    public static boolean hasCycle2(Node head) {
        Node fast=head;
        Node slow=head;
        if(head==null || head.next==null){
            return false;
        }
        while(fast!=null && fast.next!=null){

            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }

        return false;

    }


}
