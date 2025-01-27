package ClassLectures.twentySixClass;

public class TreeNode<T> {
    private T data;
    private TreeNode<T> firstNode;
    private TreeNode<T> secondNode;
    private TreeNode<T> thirdNode;

    public TreeNode(T data) {
        this.data = data;
        this.firstNode = null;
        this.secondNode = null;
        this.thirdNode = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public TreeNode<T> getFirstNode() {
        return firstNode;
    }

    public void setFirstNode(TreeNode<T> firstNode) {
        this.firstNode = firstNode;
    }

    public TreeNode<T> getSecondNode() {
        return secondNode;
    }

    public void setSecondNode(TreeNode<T> secondNode) {
        this.secondNode = secondNode;
    }

    public TreeNode<T> getThirdNode() {
        return thirdNode;
    }

    public void setThirdNode(TreeNode<T> thirdNode) {
        this.thirdNode = thirdNode;
    }
}