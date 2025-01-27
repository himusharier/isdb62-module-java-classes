package ClassLectures.Tree;

public class AVLTree {

    NodeAVLTree root;

    // Get the height of the node
    int height(NodeAVLTree N) {
        if (N == null)
            return 0;
        return N.height;
    }

    // Get maximum of two integers
    int max(int a, int b) {
        return Math.max(a, b);
    }

    // Right rotate subtree rooted with y
    NodeAVLTree rightRotate(NodeAVLTree y) {
        NodeAVLTree x = y.left;
        NodeAVLTree T2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T2;

        // Update heights
        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;

        // Return new root
        return x;
    }

    // Left rotate subtree rooted with x
    NodeAVLTree leftRotate(NodeAVLTree x) {
        NodeAVLTree y = x.right;
        NodeAVLTree T2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        // Update heights
        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;

        // Return new root
        return y;
    }

    // Get balance factor of node N
    int getBalance(NodeAVLTree N) {
        if (N == null)
            return 0;
        return height(N.left) - height(N.right);
    }

    // Insert a key into the subtree rooted with node
    // and returns the new root of the subtree
    NodeAVLTree insert(NodeAVLTree node, int key) {
        // Perform the normal BST insertion
        if (node == null)
            return (new NodeAVLTree(key));

        if (key < node.key)
            node.left = insert(node.left, key);
        else if (key > node.key)
            node.right = insert(node.right, key);
        else // Duplicate keys not allowed
            return node;

        // Update height of this ancestor node
        node.height = 1 + max(height(node.left), height(node.right));

        // Get the balance factor of this ancestor node
        // to check whether this node became unbalanced
        int balance = getBalance(node);

        // If this node becomes unbalanced, then there are 4 cases

        // Left Left Case
        if (balance > 1 && key < node.left.key)
            return rightRotate(node);

        // Right Right Case
        if (balance < -1 && key > node.right.key)
            return leftRotate(node);

        // Left Right Case
        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Right Left Case
        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        // Return the (unchanged) node pointer
        return node;
    }

    // Utility function to print preorder traversal of the tree
    void preOrder(NodeAVLTree node) {
        if (node != null) {
            System.out.print(node.key + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    // Utility function to print inorder traversal of the tree
    void inOrder(NodeAVLTree node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.key + " ");
            inOrder(node.right);
        }
    }

    // Utility function to print postorder traversal of the tree
    void postOrder(NodeAVLTree node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.key + " ");
        }
    }

    public static void main(String[] args) {
        AVLTree tree = new AVLTree();

        // Insert nodes
        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 25);

        // Print preorder traversal of the tree
        System.out.println("Preorder traversal of constructed AVL tree is : ");
        tree.preOrder(tree.root);
        System.out.println();

        // Print inorder traversal of the tree
        System.out.println("Inorder traversal of constructed AVL tree is : ");
        tree.inOrder(tree.root);
        System.out.println();

        // Print postorder traversal of the tree
        System.out.println("Postorder traversal of constructed AVL tree is : ");
        tree.postOrder(tree.root);
        System.out.println();
    }

}
