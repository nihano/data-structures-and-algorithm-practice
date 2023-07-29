package leet_code._203_RemoveLinkedListElements;


public class Solution {
    public static Node removeElements(Node head, int val) {
        Node dummy = new Node(0);
        dummy.next=head;
        Node curr=dummy;

        while(curr.next != null) {
            if(curr.next.val == val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }

        return dummy.next;
    }
}
