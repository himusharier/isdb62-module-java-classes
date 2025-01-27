package ClassLectures.Tree;

public class TreeTestMain {
    public static void main(String[] args) {
        int[] testElement = {30, 40, 10, 50, 20, 5, 35};
        int[] testElementDifferentOrder = {50, 40, 35, 30, 20, 10, 5};
        BinarySearchTree tree = new BinarySearchTree();

        // Inserting elements
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Inorder traversal:");
        tree.inorder();

        // Deleting elements
        tree.delete(20);
        tree.delete(30);

        System.out.println("Inorder traversal after deletion:");
        tree.inorder();

        // Searching for an element
        int searchKey = 70;
        System.out.println("Is " + searchKey + " present in the tree? " + tree.search(searchKey));

        // Traversals
        System.out.println("Preorder traversal:");
        tree.preorder();

        tree.printTree();
        System.out.println("Postorder traversal:");
        tree.postorder();

        System.out.println();
        tree.printTree();

        System.out.println();
        BinarySearchTree tree1 = new BinarySearchTree();
        for (int element : testElement) {
            tree1.insert(element);
        }
        tree1.printTree();

        System.out.println();
        BinarySearchTree tree2 = new BinarySearchTree();
        for (int element : testElementDifferentOrder) {
            tree2.insert(element);
        }
        tree2.printTree();
    }
}
