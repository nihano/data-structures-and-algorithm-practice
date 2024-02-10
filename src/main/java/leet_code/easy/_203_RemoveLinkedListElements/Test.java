package leet_code.easy._203_RemoveLinkedListElements;

public class Test {
    public static void main(String[] args) {
        Node node1=new Node(2);
        Node node2=new Node(1);
        Node node3=new Node(1);
        Node node4=new Node(1);
        Node node5=new Node(1);

        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=null;

        Node temp = Solution.removeElements(node1, 2);
        System.out.println(temp.val);
        System.out.println(temp.next.val);
        System.out.println(temp.next.next.val);



    }
}
