package leet_code.easy._234_PalindromeLinkedList;

public class SolutionCleanCode {

    public static Node reverse(Node slow) {
        Node prev = null;
        Node curr = slow;
        while (curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }

    public static boolean isPalindrome2(Node head) {
        Node prev = head;
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            prev = slow;
            fast = fast.next.next;
            slow = slow.next;
        }

        prev.next = null;//break the link
        if (fast != null) {

            Node temp = slow;
            slow = slow.next;
            temp.next = null;
        }

        Node p1 = head;
        Node p2 = reverse(slow);
        while (p1 != null && p2 != null) {
            if (p1.val != p2.val) return false;
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }
}
