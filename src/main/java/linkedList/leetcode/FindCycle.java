package linkedList.leetcode;

import java.util.HashSet;

public class FindCycle {
    public static void main(String[] args) {
       Node node1 = new Node(1);
       Node node2 = new Node(2);
       Node node3 = new Node(3);
       Node node4 = new Node(4);

       node1.next=node2;
       node2.next=node3;
       node3.next=node4;
       node4.next=node2;

        System.out.println(findCycle(node1));
    }

    static boolean findCycle(Node node){
        HashSet<Node> set = new HashSet<>();
        Node current=node;
        while (current!=null){
            if (!set.add(current)) {
                return true;
            }
            current=current.next;
        }
        return false;
    }
}
