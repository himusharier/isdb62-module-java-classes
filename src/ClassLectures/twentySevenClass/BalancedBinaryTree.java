package ClassLectures.twentySevenClass;

// Checking if a binary tree is height balanced

import java.util.Objects;

// Node creation
class Node {
    int data;
    Node left;
    Node right;

    Node(int d) {
        data = d;
        left = null;
        right = null;
    }
}

// Calculate height
class Height {
    int height = 0;
}

class BalancedBinaryTree {

    Node root;

    boolean checkHeightBalance(Node root, Height heightObj) {
        if (root == null) {
            heightObj.height = 0;
            return true;
        }

        Height leftOmar = new Height();
        Height rightFaruk = new Height();
        boolean l = checkHeightBalance(root.left, leftOmar);
        boolean r = checkHeightBalance(root.right, rightFaruk);
        int leftHeight = leftOmar.height;
        int rightHeight = rightFaruk.height;
        heightObj.height = (Math.max(leftHeight, rightHeight)) + 1;

        if ((leftHeight - rightHeight >= 2)
                || (rightHeight - leftHeight >= 2))
            return false;
        else return l && r;
    }

    public static void main(String[] args) {
        Height height = new Height();

        BalancedBinaryTree tree = new BalancedBinaryTree();
        tree.root = new Node(1);

        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

//        tree.root.right.left = new Node(6);
//        tree.root.right.right = new Node(7);
//
//        tree.root.right.right.left = new Node(8);
//        tree.root.right.right.left.right = new Node(9);
        if (tree.checkHeightBalance(tree.root, height))
            System.out.println("The tree is balanced");
        else
            System.out.println("The tree is not balanced");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BalancedBinaryTree that = (BalancedBinaryTree) o;
        return Objects.equals(root, that.root);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(root);
    }
}