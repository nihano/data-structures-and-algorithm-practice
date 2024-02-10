package leet_code.easy._234_PalindromeLinkedList;

public class Solution {

    public static boolean isPalindrome(Node head) {
        Node prev = head;
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            prev = slow;
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast != null) {   //if list has odd number of nodes
            //divide the list two pieces
            //head will be the head of first list, prev tail of first list
            //slow.next will be head of second list, fast will be tail of second list
            prev.next = null; //break the link
            Node temp = slow;
            slow = slow.next;
            temp.next = null;

        } else { //list has even number of nodes
            prev.next = null;//break the link
        }

        //reverse the second half list
        Node prevOfSecondList = null;
        Node curr = slow;
        while (curr != null) {
            Node nextNode = curr.next;
            curr.next = prevOfSecondList;
            prevOfSecondList = curr;
            curr = nextNode;
        }

        //compara two lists nodes one by one
        Node p1 = head;
        Node p2 = prevOfSecondList;
        while (p1 != null && p2 != null) {
            if (p1.val != p2.val) return false;
            p1 = p1.next;
            p2 = p2.next;
        }

        return true;

    }


}

