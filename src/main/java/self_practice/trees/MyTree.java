package self_practice.trees;

import javax.naming.PartialResultException;
import java.util.LinkedList;
import java.util.Queue;

public class MyTree {
    TNode root;

    public MyTree() {
    }

    void insert(int value) {
        TNode newNode = new TNode(value);
        if (root == null) {
            root = newNode;
            return;
        }
        TNode current = root;
        while (true) {
            if (value <= current.value) {
                if (current.leftChild == null) {
                    //if left is null insert there
                    current.leftChild = newNode;
                    break;
                }
                //if current is not null (there is a node in the left) jump to that node
                current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    //if right is null insert there
                    current.rightChild = newNode;
                    break;
                }
                current = current.rightChild;
            }
        }
    }


    //PreOrder Traversal of the tree
    //Root-Left-Right
    void preOrderTraversal(TNode root) {
        if (root == null) return;
        System.out.print(root.value + ", ");
        preOrderTraversal(root.leftChild);
        preOrderTraversal(root.rightChild);
    }

    //inOrder Traversal of the tree
    //Left-Root-Right
    void inOrderTraversal(TNode root) {
        if (root == null) return;
        inOrderTraversal(root.leftChild);
        System.out.print(root.value + ", ");
        inOrderTraversal(root.rightChild);
    }

    void postOrderTraversal(TNode root) {
        if (root == null) return;// termination
        postOrderTraversal(root.leftChild); // branch and finish left subtree
        postOrderTraversal(root.rightChild); // branch and finish right subtree
        System.out.print(root.value + ", ");  // visit root
    }

    void levelOrderTraversal() {
        if (root == null) return;
        Queue<TNode> queue = new LinkedList<>();
        queue.add(root); //10
        while (!queue.isEmpty()) {
            TNode toVisit = queue.poll(); //10,6,20,4,8,17,42,5,9,29
            System.out.print(toVisit.value + ", ");//10, 6,20,4,8,17,42,5,9,29
            //29->47
            if (toVisit.leftChild != null) queue.add(toVisit.leftChild);
            if (toVisit.rightChild != null) queue.add(toVisit.rightChild);
        }
           /*
        print=>10,6,20
              .----10-------.
              |             |
          .---6--.       .--20---.
          |      |       |       |
          4-.    8-.     17   .-42-.
            |      |          |    |
            5      9          29   47


         */
    }

    //only for full binary tree, just practicing
    //no condition to check if it's FBT
    public int numberOfNodesFBT(TNode root) {
        TNode curr = root;
        int height = 0;
        while (true) {
            if (root == null) return 0;
            if (curr != null) {
                curr = curr.leftChild;
                height++;
            } else {
                break;
            }
        }
        return (int) (Math.pow(2, height) - 1);
    }

    //TRIED MYSELF, could be also used for double values?
    boolean contains1(int value) {
        if (root == null) return false;
        TNode current = root;
        while (current != null) {
            if (current.value == value) return true;
            if (value < current.value) {
                current = current.leftChild;
            } else if (value > current.value) {
                current = current.rightChild;
            }
        }
        return false;
    }

    //BETTER VERSION :)
    boolean contains(int value) {
        if (root == null) return false;
        TNode current = root;
        while (current != null) {
            if (value < current.value) current = current.leftChild;
            else if (value > current.value) current = current.rightChild;
            else return true;
        }
        return false;
    }

    boolean isLeaf(TNode node){
       return node.leftChild==null && node.rightChild==null;
    }

    //You can do thi in any order pre, inorder, postorder or level order
    void printLeaves(TNode root){
        if (root==null) return;
        if (isLeaf(root)) System.out.println(root.value);
        printLeaves(root.leftChild);
        printLeaves(root.rightChild);
    }

    int countLeaves(TNode root){
        if (root==null) return 0;
        if (isLeaf(root)) return 1;
        return countLeaves(root.leftChild) +countLeaves(root.rightChild);
    }

    int findSumOfLeaves(TNode root){
        if (root==null) return 0;
        if (isLeaf(root)) return root.value;
        return findSumOfLeaves(root.leftChild) +findSumOfLeaves(root.rightChild);
    }

    int height(TNode root){
        if (root==null) return -1;
        if (isLeaf(root)) return 0;
        return 1 + Math.max(height(root.leftChild), height(root.rightChild));
    }

    public int calculateNodeDepthSums(){
        return nodeDepthSums(root, 0);
    }

    int nodeDepthSums(TNode node, int A){
        if (node==null) return 0;
       return  A +nodeDepthSums(node.leftChild,A+1) +nodeDepthSums(node.rightChild,A+1);
    }


}



