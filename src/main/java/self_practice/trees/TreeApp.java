package self_practice.trees;

public class TreeApp {
    public static void main(String[] args) {
        MyTree tree = new MyTree();
        int[] numbers = new int[]{10, 6, 8, 20, 4, 9, 5, 17, 42, 47, 29};
        for (int i = 0; i < 11 ; i++) {
            tree.insert(numbers[i]);
        }
        VisualizeTree.printTree(tree.root, null, false);

        System.out.println("\nPre Order Traversal");
        tree.preOrderTraversal(tree.root);
        System.out.println("\nIn Order Traversal");
        tree.inOrderTraversal(tree.root);
        System.out.println("\nPost Order Traversal");
        tree.postOrderTraversal(tree.root);
        System.out.println("\nLevel Order Traversal");
        tree.levelOrderTraversal();

        MyTree tree2 = new MyTree();
        int[] numbers2 = new int[]{10, 6, 8, 20, 4, 17, 42};
        for (int i = 0; i <7 ; i++) {
            tree2.insert(numbers2[i]);
        }
        System.out.println();
        VisualizeTree.printTree(tree2.root, null, false);
        System.out.println(tree2.numberOfNodesFBT(tree2.root));

        MyTree emptyTree = new MyTree();

        System.out.println(tree.contains1(42));
        System.out.println(tree.contains(42));

        tree.printLeaves(tree.root);

        System.out.println("number of leaves: " +tree.countLeaves(tree.root));
        System.out.println("sum of leaves: " +tree.findSumOfLeaves(tree.root));
    }

}
