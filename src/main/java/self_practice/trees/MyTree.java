package self_practice.trees;

import java.util.LinkedList;
import java.util.Queue;

public class MyTree {
    TNode root;

    public MyTree() {
    }

    void insert(int value){
        TNode newNode = new TNode(value);
        if (root==null) {
            root=newNode;
            return;
        }
        TNode current = root;
        while (true){
            if (value<=current.value){
                if (current.leftChild==null){
                    //if left is null insert there
                    current.leftChild=newNode;
                    break;
                }
                //if current is not null (there is a node in the left) jump to that node
                current=current.leftChild;
            }
            else {
                if (current.rightChild==null){
                    //if right is null insert there
                    current.rightChild=newNode;
                    break;
                }
                current=current.rightChild;
            }
        }
    }
    //PreOrder Traversal of the tree
    //Root-Left-Right
    void preOrderTraversal(TNode root){
        if (root==null) return;
        System.out.print(root.value +", ");
        preOrderTraversal(root.leftChild);
        preOrderTraversal(root.rightChild);
    }

    //inOrder Traversal of the tree
    //Left-Root-Right
    void inOrderTraversal(TNode root){
        if (root==null) return;
        inOrderTraversal(root.leftChild);
        System.out.print(root.value +", ");
        inOrderTraversal(root.rightChild);
    }
    void postOrderTraversal(TNode root){
        if (root==null) return;// termination
        postOrderTraversal(root.leftChild); // branch and finish left subtree
        postOrderTraversal(root.rightChild); // branch and finish right subtree
        System.out.print(root.value+", ");  // visit root
    }
    void levelOrderTraversal(){
        if(root==null) return;
        Queue<TNode> queue=new LinkedList<>();
        queue.add(root); //10
        while(!queue.isEmpty()){
            TNode toVisit=queue.poll(); //10,6,20,4,8,17,42,5,9,29
            System.out.print(toVisit.value+", ");//10, 6,20,4,8,17,42,5,9,29
            //29->47
            if (toVisit.leftChild!=null) queue.add(toVisit.leftChild);
            if (toVisit.rightChild!=null) queue.add(toVisit.rightChild);
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

}
