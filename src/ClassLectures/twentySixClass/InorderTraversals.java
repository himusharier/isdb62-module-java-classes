package ClassLectures.twentySixClass;

public class InorderTraversals {
    // Function to print inorder traversal
    public static void printInorder(Node node) {
        if (node == null)
            return;

        // First recur on left subtree
        printInorder(node.left);

        // Now deal with the node
        System.out.print(node.data + " ");

        // Then recur on right subtree
        printInorder(node.right);
    }

    // Driver code
    public static void main(String[] args) {
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(9);
        root.right.right = new Node(6);

        // Function call
        System.out.println("Inorder traversal of binary tree is: ");
        printInorder(root);
    }
}

class Node {
    int data;
    Node left, right;

    Node(int v) {
        data = v;
        left = right = null;
    }
}