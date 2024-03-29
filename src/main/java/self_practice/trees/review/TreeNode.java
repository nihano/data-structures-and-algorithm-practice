package self_practice.trees.review;

public class TreeNode {
    // Data
    String name;
    String lastName;
    int id;
    TreeNode leftChild;// Reference left child
    TreeNode rightChild; // Reference right child

    public TreeNode(String name, String lastName, int id) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
    }
}
