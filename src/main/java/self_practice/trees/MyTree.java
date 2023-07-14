package self_practice.trees;

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
        System.out.println(root.value);
        preOrderTraversal(root.leftChild);
        preOrderTraversal(root.rightChild);
    }
}
