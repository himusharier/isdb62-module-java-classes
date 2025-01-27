package ClassLectures.twentySixClass;

// Class for BinaryTree
class BinaryTree {
    Node root;

    // Function to print preorder traversal
    public static void printPreorder(Node node) {
        if (node == null)
            return;

        // First deal with the node
        System.out.print(node.data + " ");

        // Then recur on left subtree
        printPreorder(node.left);

        // Finally recur on right subtree
        printPreorder(node.right);
    }
}

// Main class
class PreorderTraversal {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Constructing the binary tree
        tree.root = new Node(1);

        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        // Function call
        System.out.println("Preorder traversal of binary tree is: ");
        BinaryTree.printPreorder(tree.root);
    }
}
