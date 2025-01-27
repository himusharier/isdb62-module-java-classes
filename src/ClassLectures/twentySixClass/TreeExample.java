package ClassLectures.twentySixClass;

public class TreeExample {
    public static void main(String[] args) {
        // Create root node
        TreeNode<Integer> root = new TreeNode<>(1);

        // Create left and right child nodes
        root.setFirstNode(new TreeNode<>(2));
        root.setSecondNode(new TreeNode<>(3));

        // Create children for left node
        root.getFirstNode().setFirstNode(new TreeNode<>(4));
        root.getFirstNode().setSecondNode(new TreeNode<>(5));

        // Create children for right node
        root.getSecondNode().setFirstNode(new TreeNode<>(6));
        root.getSecondNode().setSecondNode(new TreeNode<>(7));
        root.getSecondNode().setThirdNode(new TreeNode<>(8));

        // Now you have a basic binary tree structure
    }
}