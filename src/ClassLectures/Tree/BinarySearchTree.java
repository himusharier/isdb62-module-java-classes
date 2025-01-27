package ClassLectures.Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is an example of BST data structure. We have demonstrated pre-order, post-order, in-order tree traversal
 * which in not limited to binary tree. This is also applicable for n tier tree structure.
 * <p>
 * Java has two implementation of tree data structure
 * TreeSet and TreeMap they are both type of Red-Black Tree(Another type of tree)
 */
public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        root = null;
    }

    // Insertion operation
    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.data)
            root.left = insertRec(root.left, key);
        else if (key > root.data)
            root.right = insertRec(root.right, key);

        return root;
    }

    // Deletion operation
    void delete(int key) {
        root = deleteRec(root, key);
    }

    Node deleteRec(Node root, int key) {
        if (root == null)
            return root;

        if (key < root.data)
            root.left = deleteRec(root.left, key);
        else if (key > root.data)
            root.right = deleteRec(root.right, key);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.data = minValue(root.right);

            root.right = deleteRec(root.right, root.data);
        }

        return root;
    }

    int minValue(Node root) {
        int minv = root.data;
        while (root.left != null) {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }

    // Search operation
    boolean search(int key) {
        return searchRec(root, key);
    }

    boolean searchRec(Node root, int key) {
        if (root == null)
            return false;
        if (root.data == key)
            return true;
        if (root.data < key)
            return searchRec(root.right, key);
        return searchRec(root.left, key);
    }

    // Inorder traversal
    void inorder() {
        inorderRec(root);
        System.out.println("\n");
    }

    // left tree -> root node -> right node
    // Start from left most node
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    // Preorder traversal
    void preorder() {
        preorderRec(root);
        System.out.println("\n");

    }

    // root node -> left node -> right node
    // Start from root node
    void preorderRec(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    // Postorder traversal
    void postorder() {
        postorderRec(root);
        System.out.println("\n");
    }

    // left node -> right node -> root node
    // Start from the left most node
    void postorderRec(Node root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.data + " ");
        }
    }

    // Print tree in a level-wise format
    void printTree() {
        int height = getHeight(root);
        int maxWidth = (int) Math.pow(2, height) - 1; // Maximum nodes in the widest level

        List<List<String>> levels = new ArrayList<>();
        for (int i = 0; i < height; i++) {
            List<String> level = new ArrayList<>(Collections.nCopies(maxWidth, " "));
            levels.add(level);
        }

        fillLevels(root, levels, 0, 0, maxWidth - 1);

        for (List<String> level : levels) {
            for (String value : level) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    // Helper method to fill each level
    void fillLevels(Node root, List<List<String>> levels, int level, int left, int right) {
        if (root == null || level >= levels.size()) {
            return;
        }

        int mid = (left + right) / 2;
        levels.get(level).set(mid, String.valueOf(root.data));

        fillLevels(root.left, levels, level + 1, left, mid - 1);
        fillLevels(root.right, levels, level + 1, mid + 1, right);
    }

    // Method to calculate the height of the tree
    int getHeight(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }

}
